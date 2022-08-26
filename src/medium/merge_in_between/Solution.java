package medium.merge_in_between;

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
        ListNode head = new ListNode(0);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        ListNode head7 = new ListNode(7);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;

        ListNode head_new = new ListNode(10000);
        ListNode head_new1 = new ListNode(10001);
        ListNode head_new2 = new ListNode(10002);
        ListNode head_new3 = new ListNode(10003);

        head_new.next = head_new1;
        head_new1.next = head_new2;
        head_new2.next = head_new3;

        print(mergeInBetween(head, 2, 5, head_new));

    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode aHead = list1;
        ListNode bHead = list1;
        while (a != 1) {
            a--;
            aHead = aHead.next;
        }
        while (b != 0) {
            b--;
            bHead = bHead.next;
        }
        bHead = bHead.next;
        aHead.next = list2;
        ListNode updated = list1;
        while (updated.next != null) {
            updated = updated.next;
        }
        updated.next = bHead;
        return list1;

    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
