class Solution {
    public int shipWithinDays(int[] arr, int d) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele : arr){
            max = Math.max(ele,max);
            sum += ele;
        }
        int lo = max;
        int hi = sum;
        int ans = -1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(days(mid,arr)<=d){
                hi = mid -1;
                ans = mid;
            }
            else lo = mid + 1;
        }
        return ans;
        
    }
    static int days(int capacity ,int[] arr){
        int days = 0;
        int c = capacity;
        for(int ele : arr){
            if(c>= ele) c -= ele;
            else{
                days++;
                c = capacity - ele;
            }
        }
        days++;
        return days;
    }
}