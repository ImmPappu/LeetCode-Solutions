class Pair{
    char ch;
    int count;
    Pair(char ch, int count){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek().ch == ch){
                int count = st.peek().count + 1;
                if(count==k){
                    st.pop();
                }
                else{
                    st.peek().count = count;
                }
            }
            else st.push(new Pair(ch,1)); 
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            Pair p = st.pop();
            
            for(int i=0;i<p.count;i++){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();
    }
}