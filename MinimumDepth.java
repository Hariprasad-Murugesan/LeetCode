package Dsa.leetcode;

class MinimumDepth {
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
    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int rightDepth = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

        return Math.min(leftDepth,rightDepth)+1;
    }
    public static int getDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calculate the minimum depth of the binary tree
        int minDepth = minDepth(root);

        // Print the result
        System.out.println("Minimum depth: " + minDepth);
    }
}