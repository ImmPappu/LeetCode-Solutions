class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]!=0) {
                list.add(nums[i]);
            }
        }
        int i = 0;
        for(;i<list.size();i++){
            nums[i]=list.get(i);
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        
    }
}