class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //    arr[i] = start + 2*i;
        // }
        // for(int ele : arr){
        //     xor = xor^ele;
        // }
        for(int i=0;i<n;i++){
            int num = start + 2*i;
            xor = xor^num;
        }
        return xor;
    }
}