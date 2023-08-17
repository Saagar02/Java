public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    /**
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        if(head !=null && head.next!=null){
            ListNode temp2 = head.next;
            ListNode temp1 = head;
            head.next = null;
            while(temp2.next!=null){
                temp1 = temp2;
                temp2 = temp2.next;
                temp1.next = head;
                head = temp1;
            }
            temp2.next = head;
            head = temp2;
            return head;
        }
        return head;
    }
}