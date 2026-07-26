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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head ;
        if(head==null || head.next==null) return head;
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        k=k%n;
        if(k==0) return head ;
        

        ListNode slow = head ;
        ListNode fast = head ;

        for(int i = 1;i<=k+1 ;i++){
            fast = fast.next;
        }       
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode t = a;
        while(t.next!=null){
            t=t.next;
        }
        t.next = head;
        return a;
 
        
    }
}