class Solution {
    public long countPairs(int[] arr, int k) {
       HashMap<Integer,Long> map = new HashMap<>();
       long pair = 0;
       for(int ele: arr){
        int g = gcd(ele,k);

            for(int key : map.keySet()){
                if((long)g * key % k ==0){
                    pair += map.get(key);
                }
            }
            map.put(g,map.getOrDefault(g,0L)+1);
       }
       return pair;
    }

    public int gcd (int a,int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}