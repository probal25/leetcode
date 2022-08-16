package easy.palindrome_linked_list;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(1);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;

        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode original = copy(head);
        ListNode current = head;
        ListNode previous = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        while(original != null && previous != null) {
            if(original.val != previous.val) return false;
            original = original.next;
            previous = previous.next;
        }
        return true;
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
