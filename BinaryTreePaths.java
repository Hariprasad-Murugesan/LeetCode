package Dsa.leetcode;

import java.util.LinkedList;
import java.util.List;

class BinaryTreePaths {

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> slist = new LinkedList<>();
        if (root == null){
            return slist;
        }

        if (root.left == null && root.right == null){
            slist.add(Integer.toString(root.val));
            return slist;
        }

        for (String s: binaryTreePaths(root.left)
             ) {
            slist.add(Integer.toString(root.val)+ "->"+s);
        }

        for (String s: binaryTreePaths(root.right)
        ) {
            slist.add(Integer.toString(root.val)+ "->"+s);
        }

        return slist;

    }

    public static void main(String[] args) {
        // Creating a sample binary tree: [1, 2, 3, null, 5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        // Creating an instance of the Solution class
        BinaryTreePaths solution = new BinaryTreePaths();

        // Calling the binaryTreePaths method
        List<String> paths = solution.binaryTreePaths(root);

        // Printing the output
        System.out.println("Binary Tree Paths: " + paths);
    }
}