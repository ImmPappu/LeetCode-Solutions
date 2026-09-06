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
class Solution {
    public int rangeSumBST(TreeNode root, int l, int h) {
        return countNode(root,l,h);
    }
    int countNode(TreeNode root,int l,int h){
        if(root==null) return 0;
        if(root.val<l) return countNode(root.right,l,h);
        else if(root.val>h) return countNode(root.left,l,h);
        else return root.val + countNode(root.left,l,h) + countNode(root.right,l,h);
    }
}