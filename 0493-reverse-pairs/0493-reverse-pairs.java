class Solution {
    static int count;
    public int reversePairs(int[] arr) {
         count = 0;
        MergeSort(arr);
        return count;
    }
     public static void MergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0; i <a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i <b.length; i++) b[i] = arr[idx++];
        MergeSort(a);
        MergeSort(b);
        Merge(a,b,arr);
    }

      public static void Merge(int[] a, int[] b, int[] arr) {

        //Reverse count
        
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            while (j < b.length && a[i] > 2L * b[j]) {
                j++;
            }
            count += j;
        }
        //  Normal Merge
        int i = 0;
        j = 0;
        int k = 0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) arr[k++] = a[i++] ;
            else {
                arr[k++] = b[j++] ;
            }
        }
        while(i<a.length) arr[k++] = a[i++] ;
        while(j<b.length) arr[k++] = b[j++] ;
    }
}