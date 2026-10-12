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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode result = new ListNode();
        ListNode cur = result;
        int carry = 0;

        while (p1 != null || p2 != null || carry != 0){
            int sum = carry;

            if (p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }

            if (p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }

            int lastNum = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(lastNum);
            cur.next = newNode;
            cur = newNode;
        }
        return result.next;
    }
}
