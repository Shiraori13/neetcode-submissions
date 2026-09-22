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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        
        ListNode currentNode = head, prevNode = null;
        
       while(head != null){
            currentNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = currentNode;
       }
       return prevNode;
    }
}
