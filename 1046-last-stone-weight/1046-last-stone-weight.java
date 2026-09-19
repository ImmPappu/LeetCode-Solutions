class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int weight = 0;
        for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            if(a!=b){ 
                int diff = Math.abs(a-b);
                pq.add(diff);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}