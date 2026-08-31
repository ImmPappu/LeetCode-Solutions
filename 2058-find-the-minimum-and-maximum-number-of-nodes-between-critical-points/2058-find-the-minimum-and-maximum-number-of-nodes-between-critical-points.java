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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
           ListNode a = head;
           ListNode b = a.next;
           ListNode c = b.next;
           int idx = 1 ;
           int fidx = -1;
           int lidx = -1;
           int minDis = Integer.MAX_VALUE;
           while(c!=null){
               if(c==null) return ans;
               if((b.val>a.val && b.val>c.val )|| (b.val<a.val && b.val<c.val)){
                   if(fidx==-1) fidx = idx;
                   if(lidx!=-1){
                       int dis = idx - lidx;
                       minDis = Math.min(dis,minDis);
                   }
                   lidx = idx ;
               }
               idx++;
               a = a.next;
               b = b.next;
               c = c.next;
           }
           int maxDis = lidx - fidx;
           if(maxDis==0) maxDis = -1;
           if(minDis == Integer.MAX_VALUE) minDis =-1;
           ans[0] = minDis;
           ans[1] = maxDis;
           return ans;
        
    }
}