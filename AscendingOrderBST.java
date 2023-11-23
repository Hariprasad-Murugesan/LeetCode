package Dsa.leetcode;

class AscendingOrderBST {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums,0,nums.length-1);
    }
    public TreeNode constructBST(int[] nums,int start,int end){
        if (start > end){
            return null;
        }
       int mid = (start + end )/2;
        TreeNode node = new TreeNode(nums[mid]);
        TreeNode leftSubtree =  constructBST(nums,start,mid-1);
        node.left=leftSubtree;
        TreeNode rightSubtree =  constructBST(nums,mid+1,end);
        node.right=rightSubtree;
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {  -10, -3, 0, 5, 9 };
        AscendingOrderBST solution = new AscendingOrderBST();
        AscendingOrderBST.TreeNode root = solution.sortedArrayToBST(nums);

        // Print the constructed binary search tree
        printBST(root);
    }

    // Helper method to print the binary search tree in inorder traversal
    public static void printBST(AscendingOrderBST.TreeNode node) {
        if (node == null) {
            return;
        }

        printBST(node.left);
        System.out.print(node.val + " ");
        printBST(node.right);
    }
}