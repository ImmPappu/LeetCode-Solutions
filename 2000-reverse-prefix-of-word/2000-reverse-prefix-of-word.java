class Solution {
    public String reversePrefix(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i =0;
        for(int j=0;j<n;j++){
            if(s.charAt(j)==ch){
                String sub = s.substring(0,j+1);
                String rev = new StringBuilder(sub).reverse().toString();
                sb.append(rev);
                i =j+1;
                break;
            }
        }
        String sub = s.substring(i);
        sb.append(sub);
        return sb.toString();
    }
}