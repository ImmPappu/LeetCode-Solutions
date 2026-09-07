/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    long max;
    long min;
    Pair(long max , long min){
        this.max=max;
        this.min=min;
    }
}
class Solution {
    
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        minmax(root);
        return flag;
    }
    Pair minmax(TreeNode root){
        if(root==null) return new Pair(Long.MIN_VALUE,Long.MAX_VALUE);
        Pair lst = minmax(root.left);
        Pair rst = minmax(root.right);
        long data = (long)(root.val);
        long min = Math.min(data,Math.min(lst.min,rst.min));
        long max = Math.max(data,Math.max(lst.max,rst.max));
        if(lst.max >= data || rst.min <=data) flag = false;
        return new Pair(max,min);
    }
}