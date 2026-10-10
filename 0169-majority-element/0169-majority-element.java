class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int num = 0;
        for(int ele : map.keySet()){
            if(map.get(ele)>max){
                max = map.get(ele);
                num = ele;
            }
        }
        return num; 
    }
}