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
 
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        bfs(root,arr,ans);
        return ans;
    }
    public void bfs(TreeNode root , List<Integer> arr , List<List<Integer>> ans){
        if(root==null) return;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(q.size()>0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;

            if(ans.size() <= level){
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(node.val);
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
    }
}