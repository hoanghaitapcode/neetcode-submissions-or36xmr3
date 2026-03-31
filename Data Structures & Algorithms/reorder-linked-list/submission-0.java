/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null &&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next =null; //Slow đang ở vị trí giữa => tách 2 linkedlist ra riêng biệt

        ListNode prev = null;

        while(curr!=null) {

            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        ListNode head1 = head;
        ListNode head2 = prev;

        while(head1!=null && head2!=null) {

            ListNode firstNext = head1.next;
            ListNode secondNext = head2.next;

            head1.next = head2;
            head2.next = firstNext;

            head2 = secondNext;
            head1 = firstNext;
        }

    }
}
