class Solution {
    public int missingInteger(int[] arr){
        int n = arr.length;
        int sum =arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1) sum +=arr[i];
            else break;
        }
        while(true){
            int ans = sum;
            boolean found = false;
            for(int i = 0;i<n;i++){
                if(arr[i]==ans){
                    found = true;  //Milne par sum ki value ko badha de rhe hai phir check kar rhe hai ki arr mei hai
                                   //ya nhi
                    break;
                }
            }
            if(!found){
            return ans;
            }
            sum++;
        }
    }
}