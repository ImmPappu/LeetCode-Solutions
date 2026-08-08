class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i = n-2 ;i>=0 ;i--){
             int count = 0;
            while(st.size()>0 && arr[i]>=st.peek()){
                    count++;
                    st.pop(); 
                }
                if(st.size()>0) count++; //agar stack mei element bacha hai tabhi next greater element mila
                ans[i] = count ;
                st.push(arr[i]);
            }
    return ans;
    }
}