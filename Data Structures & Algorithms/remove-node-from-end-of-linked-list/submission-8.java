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
        if (head.next == null && n == 1) return null;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        ListNode res = null;
        ListNode i = prev;
        ListNode before = null;
        while(i != null && n > 1){
            n--;
            before = i;
            i = i.next;            
        }
        if (before != null){
            before.next = i.next;
        }
        else{
            prev = i.next;
            i.next = null;
        }
        
            while(prev != null){
            ListNode temp = prev.next;
            prev.next = res;
            res = prev;
            prev = temp;
        }
        return res;   
    }
}
