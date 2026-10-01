class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '*') st.pop();
            else st.push(ch);
        }
        Stack<Character> st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(st2.size()>0){
            sb.append(st2.pop());
        }
        return sb.toString();     
    }
}