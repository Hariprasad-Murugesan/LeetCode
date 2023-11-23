package Dsa.leetcode;

class SymmetricTree {
      public class TreeNode {
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode leftNode,TreeNode rightNode){
        if (leftNode == null && rightNode == null){
            return true;
        }
        if (leftNode == null || rightNode == null){
            return false;
        }
        if (leftNode.val != rightNode.val){
            return false;
        }
        return isMirror(leftNode.left,rightNode.right)&& isMirror(leftNode.right,rightNode.left);
    }

    public static void main(String[] args) {
        SymmetricTree solution = new SymmetricTree();
        SymmetricTree.TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(2);
        root.left.left = solution.new TreeNode(3);
        root.right.right = solution.new TreeNode(3);

        // Check if the binary tree is symmetric
        boolean isSymmetric = solution.isSymmetric(root);
        System.out.println("Is the binary tree symmetric? " + isSymmetric);
    }
}