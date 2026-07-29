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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode forw = null;
        ListNode curr = head;
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left ==1 && right ==1) return head;
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy;
        for(int i = 1;i<left;i++){
            slow = slow.next;
        }
        for(int i = 1;i<=right;i++){
           fast = fast.next;
        }
        ListNode head2 = slow.next;
        ListNode head3 = fast.next;
        fast.next = null;
        slow.next = null;
       
        head2 = reverse(head2); 
        
        ListNode tail2 = head2;

        while(tail2.next!=null){
            tail2 = tail2.next;
        }
        slow.next = head2 ;
        tail2.next = head3 ;

        return dummy.next;
    }

        //Approach 2 Array list mei save karke 
    //     ArrayList <ListNode> arr = new ArrayList<>();
    //     ListNode temp = head;
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int i = left-1;
    //     int j = right-1;
        
    //     while(i<j){
    //        ListNode t1 = arr.get(i);
    //        ListNode t2 = arr.get(j);
    //         arr.set(i,t2);
    //         arr.set(j,t1);
    //         i++;
    //         j--;
    //     }
    //     for(i = 0 ;i<arr.size();i++){
    //         arr.get(i).next = (i==arr.size()-1) ? null : arr.get(i+1);
    //     }
    //     return arr.get(0);
    // }


    }
 
