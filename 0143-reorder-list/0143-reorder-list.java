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

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = null;
        ListNode toRev = slow;

        while(toRev != null){
            ListNode temp = toRev.next;
            toRev.next = rev;
            rev = toRev;
            toRev = temp;
        }
        slow.next = null;

        ListNode cur = head;
        ListNode ans = new ListNode(0);
        ListNode curAns = ans;
        int count = 0;

        while(rev != null){
            if(count%2 == 0 && cur.next != null){
                curAns.next = cur;
                cur = cur.next;
            } else{
                curAns.next = rev;
                rev = rev.next;
            }
            curAns = curAns.next;
            count++;
        }
        head = ans.next;
    }
}