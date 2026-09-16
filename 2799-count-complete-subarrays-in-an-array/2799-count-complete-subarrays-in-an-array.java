class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0 ;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int total = set.size();
        
        for(int i=0;i<n;i++){
            HashSet<Integer> set2 = new HashSet<>();
            for(int j=i;j<n;j++){
                set2.add(nums[j]);
                if(set2.size()==total) count++;
            }
        }
        return count;


    }
}