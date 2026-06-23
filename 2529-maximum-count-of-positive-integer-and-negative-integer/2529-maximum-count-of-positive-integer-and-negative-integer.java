class Solution {
    public int maximumCount(int[] arr) {
        //for Negaitve Counts
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>=0){
             high = mid-1;
            }
            else low = mid +1;
          
        }
          int negativecount = low;
           //for Positive Counts
             low = 0;
             high = n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]<=0){
                low = mid + 1;
            }
            else  high = mid - 1;
            
        }
        int poscount=n-low;
            if(negativecount>=poscount) return negativecount ;
            else return poscount;
}
}