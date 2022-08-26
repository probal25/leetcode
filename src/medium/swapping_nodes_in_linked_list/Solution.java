package medium.swapping_nodes_in_linked_list;

import java.util.Arrays;

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

        ListNode head = new ListNode(80);
        ListNode head1 = new ListNode(46);
        ListNode head2 = new ListNode(66);
        ListNode head3 = new ListNode(35);
        ListNode head4 = new ListNode(64);
//        ListNode head5 = new ListNode(8);
//        ListNode head6 = new ListNode(3);
//        ListNode head7 = new ListNode(0);
//        ListNode head8 = new ListNode(9);
//        ListNode head9 = new ListNode(5);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        head6.next = head7;
//        head7.next = head8;
//        head8.next = head9;

        print(swapNodes(head, 1));
    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode current = head;
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        int[] nodes = new int[count];
        int index = 0;

        while (temp != null) {
            nodes[index] = temp.val;
            index++;
            temp = temp.next;
        }

        int front = k - 1;
        int back = count - k;

        int swap = nodes[front];
        nodes[front] = nodes[back];
        nodes[back] = swap;

        ListNode[] listNodes = new ListNode[count];

        for (int i = 0; i < nodes.length; i++) {
            ListNode node = new ListNode(nodes[i]);
            listNodes[i] = node;
        }

        for (int i = 0; i < listNodes.length; i++) {
            if (i + 1 == listNodes.length) {
                listNodes[i].next = null;
            } else {
                listNodes[i].next = listNodes[i + 1];
            }
            newHead.next = listNodes[i];
            newHead = newHead.next;
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

    public static void printNodeArray(ListNode[] nodes) {
        int i = 0;
        for (ListNode node : nodes) {
            System.out.print(node.val + " - ");
        }
    }
}
