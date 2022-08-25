package easy.remove_duplicates_from_sorted_list;

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
        
        ListNode head_new = new ListNode(1);
        ListNode head_new1 = new ListNode(1);
        ListNode head_new2 = new ListNode(2);
//        ListNode head_new3 = new ListNode(3);
//        ListNode head_new4 = new ListNode(3);


        head_new.next = head_new1;
        head_new1.next = head_new2;
//        head_new2.next = head_new3;
//        head_new3.next = head_new4;

        print(deleteDuplicates(head_new));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode finalHead = dummy;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val != temp.next.val) {
                finalHead.next = new ListNode(temp.val);
                finalHead = finalHead.next;
            }
            temp = temp.next;
        }
        finalHead.next = temp;
        return dummy.next;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
