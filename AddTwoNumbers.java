package Dsa.leetcode;

class AddTwoNumbers {

    public static class TreeNode {
        int val;
        InorderTransversal.TreeNode left;
        InorderTransversal.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, InorderTransversal.TreeNode left, InorderTransversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //creating dummy array list
            ListNode dummy = new ListNode(0);
            //intialze an pointer
            ListNode curr =  dummy;
            //intialize a carry
            int carry = 0 ;
            //execute a while loop until l1 or l2 not reach null if add it will add on carry
            while (l1 != null || l2 != null||carry==1){
                int sum = 0;
                if (l1 != null){
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null){
                    sum+=l2.val;
                    l2=l2.next;
                }
                sum += carry;
                carry = sum/10;
                ListNode node = new ListNode(sum % 10);
                curr.next= node;
                curr = curr.next;

            }
            return dummy.next;

        }

    public static void main(String[] args) {
        AddTwoNumbers adder = new AddTwoNumbers();

        // Test Case 1:
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result1 = adder.addTwoNumbers(l1, l2);
        // Expected output: [7, 0, 8]
        printLinkedList(result1);

        // Test Case 2:
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = adder.addTwoNumbers(l3, l4);
        // Expected output: [0]
        printLinkedList(result2);

        // Test Case 3:
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l6 = new ListNode(1);
        ListNode result3 = adder.addTwoNumbers(l5, l6);
        // Expected output: [0, 0, 0, 1]
        printLinkedList(result3);
    }

    // Helper method to print a linked list
    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}