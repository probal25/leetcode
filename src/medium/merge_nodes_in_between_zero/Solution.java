package medium.merge_nodes_in_between_zero;

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
        ListNode head2 = new ListNode(0);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(0);
        ListNode head5 = new ListNode(2);
        ListNode head6 = new ListNode(2);
        ListNode head7 = new ListNode(0);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;

        print(mergeNodes(head));
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode finalNode = new ListNode(0);
        ListNode newHead = finalNode;
        int sum = 0;
        temp = temp.next;
        while(temp != null) {
            while (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            ListNode newNode = new ListNode(sum);
            newHead.next = newNode;
            newHead = newHead.next;

            sum = 0;
            temp = temp.next;
        }

        return finalNode.next;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
