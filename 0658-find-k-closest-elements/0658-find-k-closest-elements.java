class Pair implements Comparable<Pair>{
    int num;
    int dist;
    Pair(int num ,int dist){
        this.num = num;
        this.dist = dist;
    }
    public int compareTo(Pair p){
        if (this.dist == p.dist){
            return this.num - p.num;
        }
        return this.dist-p.dist;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){

            int dis = Math.abs(ele - x);
            
            pq.add(new Pair(ele,dis));

            if(pq.size()>k){
                pq.remove();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (pq.size()>0) {
            Pair top = pq.remove();
            ans.add(top.num);
        }
        Collections.sort(ans);
        return ans;
         
    }
}