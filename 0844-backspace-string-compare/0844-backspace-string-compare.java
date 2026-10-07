class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb1 = new StringBuilder();
        while(st.size()>0){
            sb1.append(st.pop());
        }
        String ans1 = sb1.reverse().toString();

        st.empty();

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb2 = new StringBuilder();
        while(st.size()>0){
            sb2.append(st.pop());
        }
        String ans2 = sb2.reverse().toString();
        return ans1.equals(ans2);
    }
    
}