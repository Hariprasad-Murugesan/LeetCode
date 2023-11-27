package Dsa.leetcode;

class InvertBinaryTree {
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

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        // Create a sample binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.left = new TreeNode(9);

        // Invert the binary tree
        TreeNode invertedRoot = invertBinaryTree.invertTree(root);

        // Print the original and inverted binary trees
        System.out.println("Original Binary Tree:");
        invertBinaryTree.printTree(root);

        System.out.println("\nInverted Binary Tree:");
        invertBinaryTree.printTree(invertedRoot);
    }

    private void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        // In-order traversal to print the tree
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
    }
