class Solution {
    public int firstUniqChar(String s) {
        int [] arr = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            arr[idx]++;
        }
       for(int i = 0; i < s.length(); i++){
          char ch = s.charAt(i);
           if (arr[ch -'a']==1){
                if(s.charAt(i)==ch){
                    return i;
                }
       }
       }
       return -1 ;
    }
}
