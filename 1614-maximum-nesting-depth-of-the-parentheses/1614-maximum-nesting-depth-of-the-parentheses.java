class Solution {
    public int maxDepth(String s) {
        int leftparenthesis = 0;
        int maxdepth = 0 ;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' ) {
                leftparenthesis++;
                maxdepth = Math.max(leftparenthesis,maxdepth);
            }
            if(ch == ')' ) leftparenthesis--;
        }
        return maxdepth;
    }
}