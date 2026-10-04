class Solution {
    public boolean checkValidString(String s) {
        int max = 0;
        int min =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                max++;
                min++;
            }
            else if(ch==')'){
                max--;
                min--;
            }
            else{ // ch==*
                max++;
                min--;
            }
            if(max<0) return false;
            if(min<0) min=0;
        }
        return min==0;    
    }
}