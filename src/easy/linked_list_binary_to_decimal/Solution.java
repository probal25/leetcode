package easy.linked_list_binary_to_decimal;

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

    // 0ms
    public int getDecimalValue(ListNode head) {
        ListNode currentNode = head;
        int count = 0;
        while(currentNode.next != null) {
            count++;
            currentNode = currentNode.next;
        }
        int decimal = 0;
        while(head != null) {
            decimal += Math.pow(2, count) * head.val;
            count --;
            head = head.next;
        }

        return decimal;
    }

    // 1ms
    public int getDecimalValue_(ListNode head) {
        ListNode currentNode = head;
        StringBuilder binaryBit = new StringBuilder();
        while(currentNode != null) {
            binaryBit.append(currentNode.val);
            currentNode = currentNode.next;
        }
        return Integer.parseInt(binaryBit.toString(), 2);
    }

}
