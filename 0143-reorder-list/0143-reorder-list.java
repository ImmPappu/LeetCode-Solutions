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
    ListNode reverseList(ListNode head) {    //Iterative ways //reverse
        ListNode forw = null;
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            forw=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forw;
        }
        return pre;
    }   
    public void reorderList(ListNode head) {
         if(head==null || head.next==null) return;
        ListNode a = head;
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode b = slow.next;   //head of 2nd list
        slow.next = null;
        b = reverseList(b);
        
        
        while(b!=null){
              ListNode nextA = a.next;  //Storing Value of next a and b 
              ListNode nextB = b.next; 
              
              a.next = b;            //Connecting Pointer
              b.next = nextA;
              
              a = nextA;
              b = nextB;
        }
        
    }
}