package Dsa.leetcode;

import java.util.*;

public class DeleteDuplicateInMergelinkedlist {
    public LinkedListCycle deleteDuplicates(LinkedListCycle head) {
        Set<Integer> set = new HashSet<Integer>();
        LinkedListCycle current = head;
        LinkedListCycle previous = null;

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
    LinkedListCycle next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, LinkedListCycle next) { this.val = val; this.next = next; }
}

class Main {
    public static void main(String[] args) {
        DeleteDuplicateInMergelinkedlist sol = new DeleteDuplicateInMergelinkedlist();

        // Create a linked list: 1 -> 2 -> 2 -> 3 -> 4 -> 4 -> 5
        LinkedListCycle head = new LinkedListCycle(1);
        head.next = new LinkedListCycle(2);
        head.next.next = new LinkedListCycle(2);
        head.next.next.next = new LinkedListCycle(3);
        head.next.next.next.next = new LinkedListCycle(4);
        head.next.next.next.next.next = new LinkedListCycle(4);
        head.next.next.next.next.next.next = new LinkedListCycle(5);

        // Delete duplicates and print the resulting linked list
        LinkedListCycle result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
