package Dsa.leetcode;

class HeightBalancedBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int heightDiff = Math.abs(leftHeight-rightHeight);
        if (heightDiff>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }
    public static int getHeight(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Check if the binary tree is balanced
        boolean isBalanced = isBalanced(root);

        System.out.println("The binary tree is balanced: " + isBalanced);
    }

}