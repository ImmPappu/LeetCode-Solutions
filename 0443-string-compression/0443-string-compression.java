class Solution {
        public int compress(char[] s) {
            StringBuilder ans = new StringBuilder();
            int j = 0;
            int i = 0;
            int count = 0;
            for (j = 0; j < s.length-1; j++) {
                if (s[j] != s[j + 1]) {
                    count = j - i+1;
                    ans.append(s[i]);
                    if(count>1){
                    ans.append(count);
                    }
                    i = j+1;
                }
            }
            count = s.length - i;
            ans.append(s[i]);
            if(count>1){
                ans.append(count);
            }
        for(int k = 0;k<ans.length();k++){
            s[k] = ans.charAt(k);
        }

            return ans.length() ;
        }
}