class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(st.size()==0){
                st.push(ch);
                continue;
            }
            char top = st.peek();
            if(top == 'A' && ch == 'B' || top =='C' && ch == 'D') st.pop();
            else st.push(ch);
        }
        return st.size();
    }
}