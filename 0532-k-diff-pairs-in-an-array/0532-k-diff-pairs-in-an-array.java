class Solution {
    public int findPairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pair = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]+k))  pair.add(arr[i]);
            if(set.contains(arr[i]-k))  pair.add(arr[i]-k);
            set.add(arr[i]);
        }
    return pair.size();
    }
}