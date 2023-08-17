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

    //static boolean isFinish = false;
    static int count = 0;

    public ListNode traverse(ListNode temp , int n ){

        if(temp.next == null){
            System.out.println(n + " "+count );
            count++;
            return temp ;    
        }
        traverse(temp.next,n);
        if(count > 0){
            System.out.println(n + " "+count );
            count ++;
        }

        if(count == n+1){
            System.out.println(n + " "+count );
            temp.next = temp.next.next;
        }
        return temp;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        if(head.next == null){
            head = null;
            return head;
        }
        if(head != null){
            traverse(temp,n);
        }
        return head;
    }
}
