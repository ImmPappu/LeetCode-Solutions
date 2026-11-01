class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++){
           min = Math.min(min,nums[i]);
        }
        for(int i=0;i<n;i++){
            sum = sum + nums[i]-min;
        }
        
        return sum;

       
    }
}