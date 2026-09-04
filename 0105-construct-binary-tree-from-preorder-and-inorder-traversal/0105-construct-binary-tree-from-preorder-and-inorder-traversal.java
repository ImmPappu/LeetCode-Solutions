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
    public TreeNode buildTree(int[] pre, int[] in) {
        int n = in.length;
        return build(0,n-1,0,n-1,in,pre);
    }
    public TreeNode build(int pLo, int pHi , int iLo, int iHi ,int in[], int pre[]){
        if(pLo>pHi || iLo>iHi) return null;
        int val = pre[pLo];
        TreeNode root = new TreeNode(val);
        
        int r = -1;
        for(int i=iLo;i<=iHi;i++){ //Locating root in inorder array
            if(in[i]==val){
                r = i;
                break;
            }
        }
        int cnt = r-iLo;
        root.left = build(pLo+1,pLo+cnt,iLo,r-1,in,pre);
        root.right = build(pLo+cnt+1,pHi,r+1,iHi,in,pre);
        
        return root;  
    }
}