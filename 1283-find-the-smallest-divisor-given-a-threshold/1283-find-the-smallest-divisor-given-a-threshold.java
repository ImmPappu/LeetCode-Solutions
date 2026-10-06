class Solution {
    public int smallestDivisor(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(ele,max);
        }
        int lo  = 1 , hi = max;
        int ans = 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(divisor(arr,mid)<=k){
                hi = mid - 1;
                ans = mid;
            }
            else lo = mid + 1;
        }
        return ans;
    }
    int divisor(int[] arr ,int div ){
        int divisor = 0;
        for(int ele : arr){
            divisor = divisor + Math.ceilDiv(ele,div);
        }
    return divisor;
    }
}