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
    //static int count = 0;

    public int traverse(ListNode temp , int n ){
        //System.out.println("Count after = "+ count);
        if(temp.next == null){
            return 1 ;    
        }
        int count = traverse(temp.next,n);
        //System.out.println("Count of node = "+ count+1);
        if(count == n){
            //System.out.println(n + " hello "+count );
            temp.next = temp.next.next;
        }
        return count+1 ;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //System.out.println(n + " hello "+count );
        if(head.next == null){
            head = null;
            return head;
        }
        if(head != null){
            int count = traverse(head,n);
            if(count == n){
                head = head.next;
            }
        }
        return head;
    }
}