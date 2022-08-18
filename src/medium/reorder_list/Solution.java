package medium.reorder_list;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
//        ListNode head4 = new ListNode(5);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
//        head3.next = head4;

        reorderList(head);
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tail = slow;
        slow = slow.next;
        tail.next = null;

        slow = revert(slow);
        merge(head, slow);
    }

    private static ListNode revert(ListNode node) {
        if (node == null) return null;
        ListNode current = node;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    private static ListNode merge(ListNode a, ListNode b) {
        ListNode res = a;
        if (res == null) return res;
        while ( a != null && b != null) {  // both non null;
            ListNode an = a.next, bn = b.next;
            a.next = b;
            b.next = an;
            a = an;
            b = bn;
        }
        return res;
    }

    public static ListNode copy(ListNode node){
        if (node == null)
            return null;

        ListNode head = new ListNode(node.val);
        ListNode headTemp = head;
        ListNode nodeTemp = node;

        while (nodeTemp.next != null){
            nodeTemp = nodeTemp.next;
            headTemp.next = new ListNode(nodeTemp.val);
            headTemp = headTemp.next;
        }

        return head;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

}
