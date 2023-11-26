package Dsa.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReverseLinkedList {


      public class ListNode {
         int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head) {
/*        List<ListNode> nodes = new ArrayList<>();
        while (head != null){
            nodes.add(head);
            head=head.next;
        }
        Collections.reverse(nodes);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (ListNode node:nodes
             ) {
            current.next = new ListNode(node.val);
            current = current.next;
        }
        return dummy.next;*/

        return reverseListInt(head,null);

    }

    private ListNode reverseListInt(ListNode head,ListNode newhead){
        if (head == null){
            return newhead;
        }
        ListNode next = head.next;
        head.next = newhead;
        return reverseListInt(next,head);
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example Usage:
        ReverseLinkedList.ListNode list = solution.new ListNode(1);
        list.next = solution.new ListNode(2);
        list.next.next = solution.new ListNode(3);

        System.out.println("Original List:");
        solution.printList(list);

        ReverseLinkedList.ListNode reversedList = solution.reverseList(list);

        System.out.println("\nReversed List:");
        solution.printList(reversedList);
    }

    private void printList(ListNode list) {
    }
}