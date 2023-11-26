package Dsa.leetcode;

class RemovedLinkedListElements {

     public class ListNode {
        int val;
          ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        RemovedLinkedListElements solution = new RemovedLinkedListElements();

        // Example Usage:
        ListNode list = solution.new ListNode(1);
        list.next = solution.new ListNode(2);
        list.next.next = solution.new ListNode(6);
        list.next.next.next = solution.new ListNode(3);
        list.next.next.next.next = solution.new ListNode(4);
        list.next.next.next.next.next = solution.new ListNode(5);
        list.next.next.next.next.next.next = solution.new ListNode(6);

        System.out.println("Original List:");
        solution.printList(list);

        int valToRemove = 6;
        ListNode result = solution.removeElements(list, valToRemove);

        System.out.println("\nList after removing elements with value " + valToRemove + ":");
        solution.printList(result);
    }

    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}