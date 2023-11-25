public class IntersectionOfTwoLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode nextNode) {
            val = x;
            next = nextNode;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headB == null || headA == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example 1
        ListNode intersectNode1 = new ListNode(8, new ListNode(5));
        ListNode listA1 = new ListNode(4, new ListNode(1, intersectNode1));
        ListNode listB1 = new ListNode(5, new ListNode(6, new ListNode(1, intersectNode1)));

        printIntersection(listA1, listB1);  // Expected Output: Intersected at '8'

        // Example 2
        ListNode intersectNode2 = new ListNode(2, new ListNode(5));
        ListNode listA2 = new ListNode(1, new ListNode(9, new ListNode(1, intersectNode2)));
        ListNode listB2 = new ListNode(3, intersectNode2);

        printIntersection(listA2, listB2);  // Expected Output: Intersected at '2'

        // Example 3
        ListNode listA3 = new ListNode(2, new ListNode(6, new ListNode(4, new ListNode(5))));
        ListNode listB3 = new ListNode(1, new ListNode(5, new ListNode(5)));

        printIntersection(listA3, listB3);  // Expected Output: No intersection
    }

    private static void printIntersection(ListNode listA, ListNode listB) {
        IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        ListNode intersectionNode = solution.getIntersectionNode(listA, listB);

        if (intersectionNode != null) {
            System.out.println("Intersected at '" + intersectionNode.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
