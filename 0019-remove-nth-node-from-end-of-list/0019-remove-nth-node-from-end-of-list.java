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
        ListNode slow = res;
        ListNode fast = head;
        int count = 0;

        while(fast != null){
            if(count >= n){
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }
        
        if(slow != null && slow.next != null && slow.next.next != null){
            slow.next = slow.next.next;
        } else {
            slow.next = null;
        }

        return res.next;
    }
}