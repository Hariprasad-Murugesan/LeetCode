package Dsa.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class InorderTransversal {
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

        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> output_arr = new ArrayList<>();
            if (root == null) {
                return output_arr;
            }
            TreeNode current = root;
            while (current != null || !stack.isEmpty()) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;

                }
                current = stack.pop();
                output_arr.add(current.val);
                current = current.right;
            }
            return output_arr;
        }
    }
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create an instance of TreeNode and call inorderTraversal
        TreeNode treeNode = new TreeNode();
        List<Integer> inorder = treeNode.inorderTraversal(root);

        // Print the inorder traversal
        System.out.println("Inorder traversal: " + inorder);
    }
}