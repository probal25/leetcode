package medium.add_two_number;

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
        ListNode head = new ListNode(9);
        ListNode head1 = new ListNode(9);
        ListNode head2 = new ListNode(9);
        ListNode head3 = new ListNode(9);
        ListNode head4 = new ListNode(9);
        ListNode head5 = new ListNode(9);
        ListNode head6 = new ListNode(9);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        ListNode head_new = new ListNode(9);
        ListNode head_new1 = new ListNode(9);
        ListNode head_new2 = new ListNode(9);
        ListNode head_new3 = new ListNode(9);


        head_new.next = head_new1;
        head_new1.next = head_new2;
        head_new2.next = head_new3;

        print(addTwoNumbers(head, head_new));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head_1 = l1;
        ListNode head_2 = l2;
        ListNode finalNode = new ListNode(0);
        ListNode head = finalNode;
        int carry = 0;
        while (head_1 != null && head_2 != null) {
            int val = head_1.val + head_2.val + carry;
            carry = 0;
            if (val > 9) {
                val = val % 10;
                carry = 1;
            }
            head.next = new ListNode(val);
            head_1 = head_1.next;
            head_2 = head_2.next;
            head = head.next;
        }

        if (head_1 != null) {
            ListNode tail = head_1;
            while (tail != null) {
                int val = tail.val + carry;
                carry = 0;
                if (val > 9) {
                    val = val % 10;
                    carry = 1;
                }
                tail.val = val;
                tail = tail.next;
            }
            head.next = head_1;
        }

        if (head_2 != null) {
            ListNode tail = head_2;
            while (tail != null) {
                int val = tail.val + carry;
                carry = 0;
                if (val > 9) {
                    val = val % 10;
                    carry = 1;
                }
                tail.val = val;
                tail = tail.next;
            }
            head.next = head_2;
        }

        if (carry == 1) {

            ListNode node = finalNode;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new ListNode(carry);
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

    public static ListNode copy(ListNode list) {
        if (list == null)
            return null;

        ListNode res = new ListNode(list.val);
        ListNode resTmp = res;
        ListNode listTmp = list;

        while (listTmp.next != null) {
            listTmp = listTmp.next;
            resTmp.next = new ListNode(listTmp.val);
            resTmp = resTmp.next;
        }

        return res;
    }
}
