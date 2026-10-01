class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2!=0) return false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') st.push(ch);
            else{   //ch is a closing bracket
                if(st.size()==0) return false;
                char top = st.peek();
                if(SameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
    public boolean SameStyle(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
    }
}