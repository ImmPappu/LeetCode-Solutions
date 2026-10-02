class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch =='0' ||ch =='1' ||ch =='2' ||ch =='3' ||ch =='4' ||ch =='5' ||ch =='6' ||ch =='7' ||ch =='8' ||ch =='9') st.pop();
            else st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}