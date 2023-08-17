
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        
            ListNode temp = head;
        if(head!=null){
            
            while(temp!= null && temp.next!=null){
                temp = temp.next.next;
                head = head.next;
            }
        }
        return head;
    }
}