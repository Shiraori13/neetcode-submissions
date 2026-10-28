/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(curA != null){
            curA = curA.next;
            sizeA++;
        }
        while(curB != null){
            curB = curB.next;
            sizeB++;
        }
        int dif = Math.abs(sizeA - sizeB);
        if (sizeA > sizeB){
            ListNode pA = headA;
            ListNode pB = headB;

            while(dif > 0){
                pA = pA.next;
                dif--;
            }
            while(pA != null && pB != null){
                if (pA == pB){
                    return pA;
                }
                pA = pA.next;
                pB = pB.next;
            }
        }
        else{
            ListNode pA = headA;
            ListNode pB = headB;

            while(dif > 0){
                pB = pB.next;
                dif--;
            }
            while(pA != null && pB != null){
                if (pA == pB){
                    return pA;
                }
                pA = pA.next;
                pB = pB.next;
            }
        }
        return null;
    }
}