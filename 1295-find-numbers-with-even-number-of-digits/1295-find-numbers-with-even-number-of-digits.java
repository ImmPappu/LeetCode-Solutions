class Solution {
    public int findNumbers(int[] arr) {
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int size =0;
            while(arr[i]>0){
                int digit = arr[i]%10;
                arr[i]=arr[i]/10;
                size++;
            }
            if(size%2==0){
                    ans++;
                }
        }
        return ans;
        
        
    }
}