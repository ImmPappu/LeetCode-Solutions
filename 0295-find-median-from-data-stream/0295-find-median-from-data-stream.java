class MedianFinder {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        public MedianFinder() {
        }

        public void addNum(int num) {
            if(maxHeap.size()==0) maxHeap.add(num);
            else{
                if(num<maxHeap.peek()) maxHeap.add(num);   // num = 6 aur maxheap ka peek = 5,4,3,2,1 , minheap ka peek = 10,20,50,60,65
                else minHeap.add(num);
            }
            if(maxHeap.size()==minHeap.size()+2){
                minHeap.add(maxHeap.remove());
            }
            if(minHeap.size()==maxHeap.size()+2){
                maxHeap.add(minHeap.remove());
            }
        }
        // 1 2 3 4 5 6
        public double findMedian() {
            if(maxHeap.size()==minHeap.size()+1){
                return maxHeap.peek();
            }
            else if(minHeap.size()==maxHeap.size()+1){
                return minHeap.peek();
            }
            else return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }