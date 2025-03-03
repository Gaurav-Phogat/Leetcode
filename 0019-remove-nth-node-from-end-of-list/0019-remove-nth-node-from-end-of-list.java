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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode curr = res;
        ListNode fast = head;
        int count = 0;

        while(fast != null){
            if(count < n) count++;
            else {
                curr = curr.next;
            }
            fast = fast.next;
        }
        if(curr.next.next != null){
            curr.next = curr.next.next;
        } else {
            curr.next = null;
        }

        return res.next;
    }
}