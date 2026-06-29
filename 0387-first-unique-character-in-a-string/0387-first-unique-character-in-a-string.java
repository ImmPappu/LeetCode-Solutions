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
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch){
                    return j;
                }
            }
       }
       }
       return -1 ;
    }
}
