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

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = rev;
            rev = slow;
            slow = temp;
        }
        ListNode curr = head;
        while(curr != null){
            ListNode temp1 = curr.next,temp2 = rev.next;
            curr.next = rev;
            rev.next = temp1;
            curr = temp1;
            rev = temp2;
        }
    }
}