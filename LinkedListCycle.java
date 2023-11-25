package Dsa.leetcode;


import java.util.HashSet;

public class LinkedListCycle {


    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode currNode = head;

        while (currNode != null) {
            if (visitedNodes.contains(currNode)) {
                return true;
            }
            visitedNodes.add(currNode);
            currNode = currNode.next;
        }

        return false;
    }
    public static void main(String[] args) {
        // Add your test cases here

        ListNode list1 = new ListNode(1);
        list1.next = new LinkedListCycle(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        System.out.println(hasCycle(list1));  // Should print false

        // Test Case 2: Cycle exists
        ListNode list2 = new ListNode(1);
        list2.next = new LinkedListCycle(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = list2.next;  // Creating a cycle
        System.out.println(hasCycle(list2));  // Should print true

        // Test Case 3: Empty list
        ListNode list3 = null;
        System.out.println(hasCycle(list3));
    }


}

