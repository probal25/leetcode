package problem.odd_even_linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(5);
        ListNode head4 = new ListNode(6);
        ListNode head5 = new ListNode(4);
        ListNode head6 = new ListNode(7);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        print(oddEvenList(head));

    }

    public static ListNode oddEvenList(ListNode head) {

        if (head == null) return null;
        ListNode current = head;
        ListNode count = head;
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        if (length == 1) return head;

        int[] values = new int[length];
        int[] newValues = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = count.val;
            count = count.next;
        }

        int j = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                newValues[j] = values[i];
                j++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                newValues[j] = values[i];
                j++;
            }
        }

        ListNode[] nodes = new ListNode[length];

        for (int i = 0; i < newValues.length; i++) {
            nodes[i] = new ListNode(newValues[i]);
        }

        for (int i = 0; i < nodes.length; i++) {

            if (i + 1 == nodes.length) {
                nodes[i].next = null;
            } else {
                nodes[i].next = nodes[i + 1];
                newHead.next = nodes[i];
                newHead = newHead.next;
            }
        }

        return dummy.next;

    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}