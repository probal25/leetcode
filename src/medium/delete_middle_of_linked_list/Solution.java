package medium.delete_middle_of_linked_list;


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
//        ListNode head5 = new ListNode(6);
//        ListNode head6 = new ListNode(7);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
        
        deleteMiddle(head);
    }
    
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
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
