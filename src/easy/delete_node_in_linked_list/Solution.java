class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        ListNode current = node;
        current.val = node.next.val;
        current.next = node.next.next;

    }
}