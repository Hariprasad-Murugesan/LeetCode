package Dsa.leetcode;

import java.util.*;

public class DeleteDuplicateInMergelinkedlist {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode current = head;
        ListNode previous = null;

        while (current != null){
            if (set.contains(current.val)){
                previous.next = current.next;
            }else {
                set.add(current.val);
                previous =current;
            }
            current = current.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Main {
    public static void main(String[] args) {
        DeleteDuplicateInMergelinkedlist sol = new DeleteDuplicateInMergelinkedlist();

        // Create a linked list: 1 -> 2 -> 2 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        // Delete duplicates and print the resulting linked list
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
