class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele : map.values()){
            if(set.contains(ele)) return false;
            set.add(ele);
        }
        return true;
    }
}