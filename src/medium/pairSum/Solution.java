package medium.pairSum;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(100000);
//        ListNode head2 = new ListNode(2);
//        ListNode head3 = new ListNode(1);

        head.next = head1;
//        head1.next = head2;
//        head2.next = head3;

        System.out.println(pairSum(head));
    }
    public static int pairSum(ListNode head) {
        ListNode original = head;
        ListNode copy = copy(head);
        
        ListNode current = copy;
        ListNode previous = null;
        ListNode next;
        int count = 0;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count ++;
        }

        int max_sum = 0;
        while (count != (count/2)) {
            int sum = original.val + previous.val;
            max_sum = Math.max(sum, max_sum);
            count --;
            original = original.next;
            previous = previous.next;
        }
        return max_sum;
    }

    public static ListNode copy(ListNode list){
        if (list == null)
            return null;

        ListNode res = new ListNode(list.val);
        ListNode resTmp = res;
        ListNode listTmp = list;

        while (listTmp.next != null){
            listTmp = listTmp.next;
            resTmp.next = new ListNode(listTmp.val);
            resTmp = resTmp.next;
        }

        return res;
    }
}
