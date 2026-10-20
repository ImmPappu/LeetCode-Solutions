class Solution {
    public int thirdMax(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.reverse(list);
        if(list.size()<3){
            return list.get(0);
        }
    return list.get(2);
    }
}