class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int numsSum=0;
        for(int ele : nums){
            numsSum += ele;
        }
        return (int)sum-numsSum;
    }
}