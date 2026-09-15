class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
           HashSet<Integer> prefix = new HashSet<>();
           HashSet<Integer> suffix = new HashSet<>();
           for(int j=0;j<=i;j++){
            prefix.add(nums[j]);
           }
           for(int j=i+1;j<n;j++){
            suffix.add(nums[j]);
           }
           ans[i]= prefix.size()-suffix.size();
        }
        return ans;
    }
}