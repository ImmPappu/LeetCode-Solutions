class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");  // Split string where / this get

        for(String part : parts){
            if(part.equals("") || part.equals(".")) continue; //if get single . just ignor
            if(part.equals("..")){
                if(!st.isEmpty()) st.pop();  // remove directiories
            }
            else st.push(part);
        }
        StringBuilder sb = new StringBuilder();
        for(String dir : st){
            sb.append("/");
            sb.append(dir);
        }
        if(sb.length() == 0) return "/";
        return sb.toString();
    }
}