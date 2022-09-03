package swap_node_in_pairs;


class ListNode {
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

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode head1 = new ListNode(7);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(5);
        ListNode head5 = new ListNode(9);
        ListNode head6 = new ListNode(8);
        ListNode head7 = new ListNode(1);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;

        print(swapPairs(head));
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode current = head;
        ListNode temp;
        ListNode newHead = new ListNode(0);
        ListNode dummy = newHead;

        while (current.next != null && current.next.next != null) {
            temp = new ListNode(current.next.val);
            dummy.next = temp;
            dummy.next.next = new ListNode(current.val);
            dummy = dummy.next.next;
            current = current.next.next;
        }
        if (current.next != null) {
            temp = new ListNode(current.next.val);
            dummy.next = temp;
            dummy.next.next = new ListNode(current.val);
        } else {
            dummy.next = current;
        }
        return newHead.next;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

}
