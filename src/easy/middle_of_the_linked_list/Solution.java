package easy.middle_of_the_linked_list;

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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;

        if (temp == null) return null;
        while(temp.next != null) {
            temp = temp.next;
            count++;
        }

        int middle = count / 2;
        if (count%2 != 0) middle = (count / 2) + 1;
        count = 0;
        while(count != middle) {
            head = head.next;
            count++;
        }
        return head;
    }

    public ListNode efficientMiddleNode(ListNode head) {
        ListNode tortoise = head;
        ListNode rabbit = head;
        while(rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }

        return tortoise;
    }
}
