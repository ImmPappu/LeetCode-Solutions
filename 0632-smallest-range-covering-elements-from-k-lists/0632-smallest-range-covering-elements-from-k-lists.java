class Solution {
    class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele , int row, int col){
            this.ele=ele;
            this.row=row;
            this.col=col;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> list) {
        PriorityQueue<Triplet> minHeap = new PriorityQueue<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){   
            int ele = list.get(i).get(0);                // har array ke first index ke ele ko minHeap mei dalenge 
            minHeap.add(new Triplet(ele,i,0));

            max = Math.max(max,ele);
            min = Math.min(min,ele);
        }
        int a = min;
        int b = max; // [a,b] is the range

        while(true){
            Triplet top = minHeap.remove();
            int ele = top.ele, row = top.row, col = top.col;

            if(max-ele<b-a){
                a = ele;
                b = max;
            }
            if(col == list.get(row).size() -1) break;   //n-1 type where n was size of each subarray
            int next = list.get(row).get(col+1);
            max = Math.max(max,next);  // max ko update karo next ele se
            minHeap.add(new Triplet(next,row,col+1));
        }
        return new int[]{a,b};
    }
}