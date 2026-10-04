class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int xor =0;
        for(int key : map.keySet()){
            if(map.get(key)>1)  xor = xor^key;
        }
        return xor;
    }
}