class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i<arr.length){
            if(arr[i]== i  || arr[i] >= n) i++;
            else swap(arr,i,arr[i]);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i) return i;
        }
        return n;
    }
    public static void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}