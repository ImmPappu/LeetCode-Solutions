class Solution {
    static int count;
    public static void MergeSort(int [] nums){
        int n = nums.length;
        int idx=0;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i] = nums[idx++];
        for(int i=0;i<b.length;i++) b[i] = nums[idx++];
        MergeSort(a);
        MergeSort(b);
        Merge(a,b,nums);
    }

    public static void Merge(int[] a ,int[] b,int[] nums){
        int i = 0,j = 0,k = 0;
        count = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]) {
                count++;
                nums[k++] = b[j++];
}

            else if(a[i]<b[j]) nums[k++]=a[i++];
            else nums[k++]=b[j++];
        }
         while(i<a.length) nums[k++]=a[i++];
         while(j<b.length) nums[k++]=b[j++];
    }
    public boolean containsDuplicate(int[] nums) {
       MergeSort(nums);
       for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1])
                return true;
        }

        return false;
    }
}