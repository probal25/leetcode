package easy.LinkedListCycle;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> visited = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            if (visited.isEmpty()) visited.add(current);
            else {
                if (visited.contains(current.next)) return true;
                visited.add(current);
            }
            current = current.next;
        }
        return false;
    }

    // slow and fast pointer
    // slow = x, fast = 2x
    public boolean hasCycleEfficient(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}