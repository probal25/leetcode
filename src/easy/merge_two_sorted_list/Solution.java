package easy.merge_two_sorted_list;
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

class Solution {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        ListNode newList = mergeTwoLists(listNode, listNode2);
//        System.out.println(mergeTwoLists(listNode, listNode2));

        while (newList.next != null) {
            System.out.println(newList.val);
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return null;
    }
}
