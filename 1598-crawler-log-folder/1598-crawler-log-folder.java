class Solution {
    public int minOperations(String[] arr) {
        int n = arr.length;
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            String s = arr[i];
            if(s.equals("./")) continue;

            if(s.equals("../")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(s);
        }
        return st.size();
        
    }
}