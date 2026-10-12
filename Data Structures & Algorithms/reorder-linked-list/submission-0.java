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
        ListNode fast = head.next;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode part1 = head;
        ListNode part2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode cur = part2;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        while(prev != null){
            ListNode temp = part1.next;
            ListNode temp2 = prev.next;

            part1.next = prev;
            prev.next = temp;
            part1 = temp;
            prev = temp2;
        }
        
    }
}
