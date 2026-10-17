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
    // public int pairSum(ListNode head) {
        // Stack<Integer> st1 = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();
        // int max = Integer.MIN_VALUE;
        // ListNode temp = head;
        // while(temp!=null){
        //     st1.push(temp.val);
        //     temp = temp.next;
        // }
        // while(st1.size()>0){
        //     st2.push(st1.pop());
        // }
        // temp = head;
        // while(temp!=null){
        //     st1.push(temp.val);
        //     temp = temp.next;
        // }
        // int n = st1.size(); 
        // while(st1.size() >= n/2 ){
        //     int a = st1.pop();
        //     int b = st2.pop();
        //     int sum = a + b;
        //     max = Math.max(sum,max);
        // }
        // return max;
    // }
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int n = arr.size();
        for(int i=0;i<n/2;i++){
            int a = arr.get(i);
            int b = arr.get(n-1-i);
            int sum = a+b;
            max = Math.max(max,sum);
        }
        return max;
    }
}