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
    public TreeNode buildTree(int[] in, int[] post) {
        int n = in.length;
        return build(0,n-1,0,n-1,in,post);
    }
    public TreeNode build(int postLo, int postHi , int iLo, int iHi ,int in[], int post[]){
        if(postLo>postHi || iLo>iHi) return null;
        int val = post[postHi];
        TreeNode root = new TreeNode(val);

        int r = -1;
        for(int i=iLo;i<=iHi;i++){ //Locating root in inorder array
            if(in[i]==val){
                r = i;
                break;
            }
        }
        int cnt = r - iLo;
        root.left = build(postLo,postLo+cnt-1,iLo,r-1,in,post);
        root.right = build(postLo+cnt,postHi-1,r+1,iHi,in,post);

        return root;
        
    }
}