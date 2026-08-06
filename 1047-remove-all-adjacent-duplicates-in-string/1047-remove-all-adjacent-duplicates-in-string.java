class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()!=0 && st.peek() ==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size()!=0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
