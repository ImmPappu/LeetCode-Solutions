class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i=i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int value = ch-'A'+1;
            ans = ans*26 + value;
        }
        return ans;
    }
}