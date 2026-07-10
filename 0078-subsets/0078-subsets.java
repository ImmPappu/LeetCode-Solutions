class Solution {
     public static void subset(List<Integer>list,int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length) {
            ans.add(new ArrayList<>(list));

            return;
        }
        list.add(nums[index]);
         subset(list,nums,index+1,ans);
         list.remove(list.size()-1);
         subset(list,nums,index+1,ans);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(list,nums,0,ans);
        return ans;
        
    }
}