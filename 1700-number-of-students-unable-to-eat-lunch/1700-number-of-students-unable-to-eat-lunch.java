class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> st = new Stack<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int student : students){
            q.add(student);
        }
        for(int i = 0 ;i<sandwiches.length;i++){
            int size = q.size();

            while(size>0 && q.peek()!=st.peek()){  //jab queue mei [1,1,1] ho aur stack ke top par 0 toh q.add(q.remove infinite loop mei nas fas jaye
                q.add(q.remove());
                size--;
            }
            if(size==0){
                break;
            }
            //student mil gya
            q.remove();
            st.pop();
        }
        return q.size();
    }
}