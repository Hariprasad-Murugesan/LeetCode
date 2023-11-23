package Dsa.leetcode;

class MaximumDepth {
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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth =  maxDepth(root.right);
        int maxSubtreeDepth = Math.max(leftDepth, rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) {
        MaximumDepth solution = new MaximumDepth();

        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calculate the maximum depth of the binary tree
        int maxDepth = solution.maxDepth(root);

        // Print the result
        System.out.println("Maximum depth of the binary tree: " + maxDepth);
    }

}