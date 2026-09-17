class Pair{
   int dis;
   TreeNode node;
   Pair(TreeNode node,int dis){
       this.dis=dis;
       this.node=node;
   }
}
class Solution {
    static TreeNode start;
    static HashMap<TreeNode,TreeNode> parent;
    public int amountOfTime(TreeNode root, int target) {
        start = null;
        parent = new HashMap<>();
        dfs(root,target);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,0));
        int time = 0;
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(start);
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int dis = front.dis;
            time = Math.max(time,dis);
            if(node.left!=null && !burned.contains(node.left)){
                q.add(new Pair(node.left,dis+1));
                burned.add(node.left);
            }
            if(node.right!=null && !burned.contains(node.right)){
                q.add(new Pair(node.right,dis+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),dis+1));
                burned.add(parent.get(node));
            }
        }
        return time;
    }

    public void dfs(TreeNode root,int target) {
        if(root == null) return;
        if(root.val==target) start = root;
        if(root.left!=null) parent.put(root.left,root);
        if(root.right!=null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}