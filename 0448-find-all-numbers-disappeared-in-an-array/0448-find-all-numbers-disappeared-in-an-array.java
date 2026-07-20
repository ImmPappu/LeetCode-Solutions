class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
       List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i= 0;
        while(i<arr.length){
            int rightidx = arr[i]-1;
            if(arr[i]==i+1 || arr[rightidx]==arr[i]) i++;
            else swap(arr,i,rightidx);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                ans.add(i+1);
        }
        return ans;
    }

    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}