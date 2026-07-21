class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i<arr.length){
            int rightidx = arr[i]-1;
            if(arr[i]== i+1  || arr[i] >= n || arr[rightidx]==arr[i]) i++;
            else swap(arr,i,rightidx);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return arr[i];
        }
        return n+1;
    }
    public static void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
