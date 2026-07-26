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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        if(head1==null && head2 == null) return null;
        if(head1==null) return head2;
        if(head2==null) return head1;
         while(t1!=null && t2!= null){
            if(t1.val<=t2.val){
                t.next=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
         }
         if(t1==null) t.next=t2;
         else t.next=t1;
         return dummy.next;
    }
}