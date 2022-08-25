package easy.intersection_of_two_linked_list;

import java.util.ArrayList;
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        List<ListNode> visitedListNodeList = new ArrayList<>();

        while(temp1 != null) {
            visitedListNodeList.add(temp1);
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            if(visitedListNodeList.contains(temp2)) {
                break;
            }
            temp2 = temp2.next;
        }

        if(temp2 != null) {
            return new ListNode(temp2.val);
        }
        return null;
    }
}
