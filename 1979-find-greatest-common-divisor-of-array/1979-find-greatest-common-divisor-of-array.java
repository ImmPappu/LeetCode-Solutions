class Solution {
    public static int gcd(int max , int min){
        if (max % min == 0)
            return min;

        return gcd(min, max % min);

    }
    public int findGCD(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++ ){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         for(int i=0;i<n;i++ ){
            if(arr[i]<min){
                min=arr[i];
            }
        }
         return gcd(max,min);

        
    }
}