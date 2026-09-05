class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

             // nums[0...i] ka maximum
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
             // nums[i...n-1] ka minimum
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            int stability=max-min;
            if(stability<=k) {
                return i;
            }
        }
    return -1;
    }
}