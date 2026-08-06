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
    public ListNode removeNodes(ListNode head){
            Stack<ListNode> st = new Stack<>();
            ListNode temp = head;
            while(temp!=null){
                 while ( st.size()>0 &&st.peek().val < temp.val ){
                     st.pop();      
                    } 
                    st.push(temp);
                temp = temp.next;
            }
            ListNode t = null;
            while(st.size()>0) {
                
                ListNode node = new ListNode(st.pop().val);
                node.next = t;
                t = node;
            }
        return t;
        }
}