class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {   
        int maxcount = 0;
        Stack<Integer> st = new Stack();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                st.push(nums[i]);
                maxcount = Math.max(maxcount,st.size());
            }
            else{
                st.clear();
            }
        }
        return maxcount;
    }
}