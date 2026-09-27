class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        for(int ele : nums){
            freq[ele]++;
        }
        int[] ans = new int[n];
        int idx = 0;
        while(idx < n){
            for(int i=1;i<101;i++){
                if(freq[i] > 0){
                    ans[idx++]= i;
                    freq[i]--;
                }
            }
        }
    return ans;
    }
}