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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> array = new ArrayList<>();
        
        ListNode p1 = list1;
        ListNode p2 = list2;
       while(p1 != null && p2 != null){
            if (p1.val < p2.val){
                array.add(p1.val);
                p1 = p1.next;
            }
            else if (p1.val > p2.val){
                array.add(p2.val);
                p2 = p2.next;
            }
            else if (p1.val == p2.val){
                array.add(p1.val);
                array.add(p2.val);
                p1 = p1.next;
                p2 = p2.next;
            }
       }
        while(p1 != null){
            array.add(p1.val);
            p1 = p1.next;
        }
        while(p2 != null){
            array.add(p2.val);
            p2 = p2.next;
        }
        if(array.isEmpty()) return null;

        ListNode result = new ListNode(array.get(0));
        ListNode currentNode = result;
        for (int i = 1; i < array.size(); i++){
            ListNode first = new ListNode(array.get(i));
            
            currentNode.next = first;
            currentNode = currentNode.next;
        }
        
        return result;
    }
}