class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;  
    }
}
// for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             ans[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return ans;