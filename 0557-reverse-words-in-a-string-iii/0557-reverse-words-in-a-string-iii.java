class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(ch ==' '){
                String sub = s.substring(i,j);
                String reverse = new StringBuilder(sub).reverse().toString();
                ans.append(reverse);
                ans.append(" ");
                i=j+1;
            }
        }
        String sub = s.substring(i,s.length());
        String reverse = new StringBuilder(sub).reverse().toString();
        ans.append(reverse);
        return ans.toString();
    }
}