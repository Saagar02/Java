/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    boolean isCyclicFound = false;
    public ListNode isCycle(ListNode l1 , ListNode l2){
        
        if(l1 == l2){
            isCyclicFound = true;
            return null;
        }
        if(l2.next == null || l2.next.next == null){
            return null;
        }
        isCycle(l1.next,l2.next.next);
        return null;
    }
    public boolean hasCycle(ListNode head) {
        
        if(head != null && head.next != null){
            isCycle(head , head.next);
        }

        return isCyclicFound;
    }
}