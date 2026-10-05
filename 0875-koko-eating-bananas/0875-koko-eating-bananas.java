class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(ele,max);
        }
        int lo = 1;
        int hi = max;
        int speed = max;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(hours(mid,arr)<=h){
                hi = mid -1;
                speed = mid;
            }
            else lo = mid + 1;
        }
        return speed;

    }

    private long hours(int speed, int[] arr) {
        long hours = 0;
        for(int ele : arr){
            if(ele%speed==0)hours +=(long)ele/speed;
            else hours += ((long)ele/speed) + 1;
    }
        return hours;
    }
}