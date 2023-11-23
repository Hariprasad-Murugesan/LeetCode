package Dsa.leetcode;

class SameTree {


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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ( p ==  null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        // Create the binary trees p and q
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        // Create an instance of Solution
        SameTree solution = new SameTree();

        // Call the isSameTree method and print the output
        boolean isSame = solution.isSameTree(p, q);
        System.out.println("Are p and q the same? " + isSame);
    }

}