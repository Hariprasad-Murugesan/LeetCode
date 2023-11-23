package Dsa.leetcode;

class getSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return getSum(root,targetSum);
    }
    public static boolean getSum(TreeNode node, int remainingSum){
        if (node ==  null){
            return false;
        }
        if (node.right == null && node.left == null){
            return remainingSum == node.val;
        }

        boolean leftNode = getSum(node.left,remainingSum - node.val );
        boolean rightNode = getSum(node.right,remainingSum- node.val);
        if (leftNode || rightNode){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);


        int targetSum = 22;

        // Check if the tree has a root-to-leaf path with the target sum
        boolean result = hasPathSum(root, targetSum);

        // Print the result
        System.out.println("Path with sum " + targetSum + " exists: " + result);

    }
}