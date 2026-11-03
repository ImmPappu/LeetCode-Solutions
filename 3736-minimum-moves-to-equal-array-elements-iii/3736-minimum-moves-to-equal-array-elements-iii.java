class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        for(int ele : nums){
            max = Math.max(max,ele);
        }
        for(int ele : nums){
            sum = sum + Math.abs(ele-max);
        }
        return sum;
    }
}