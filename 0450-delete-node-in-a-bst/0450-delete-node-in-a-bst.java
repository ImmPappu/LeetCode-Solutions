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
    public TreeNode deleteNode(TreeNode root, int target) {
        if(root==null) return null;
        if(root.val > target) 
            root.left = deleteNode(root.left,target);
        else if(root.val < target)
            root.right = deleteNode(root.right,target);
        else { // root.data == target
            //Case 1 Leaf Node 
            if(root.left==null && root.right==null) return null;
            //Case 2 single Node
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            //Case 3 (2 child Node)
            TreeNode succ = root.right;
            while(succ.left!=null) succ = succ.left;
            root.right = deleteNode(root.right,succ.val);
            succ.left = root.left;
            succ.right = root.right;
            return succ;
        } 
        return root;
    }
}