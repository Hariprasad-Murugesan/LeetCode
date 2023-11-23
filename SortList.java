package Dsa.leetcode;

import java.util.Arrays;

public class SortList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode sortList(ListNode head) {
      int count = 0;
      ListNode temp = head;

      while ( temp != null){
          temp = temp.next;
          count++;
      }
      int arr[] = new int[count];
      temp = head;
      count=0;

      while (temp != null){
          arr[count++] = temp.val;
          temp = temp.next;
      }
      Arrays.sort(arr);
      temp = head;
      count =0 ;

      while (temp != null){
          temp.val =  arr[count++];
          temp=head;
      }
      return head;
    }
    public static void main(String[] args) {
        // Create an instance of SortList
        SortList sorter = new SortList();

        // Initialize a linked list
        SortList.ListNode list = sorter.new ListNode(4, sorter.new ListNode(2, sorter.new ListNode(1, sorter.new ListNode(3))));

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(list);

        // Call the sortList method
        sorter.sortList(list);

        // Print the sorted linked list
        System.out.println("Sorted Linked List:");
        printLinkedList(list);
    }

    // Helper method to print a linked list
    private static void printLinkedList(SortList.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
