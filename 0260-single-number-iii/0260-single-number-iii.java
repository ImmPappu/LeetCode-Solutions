class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int ele : nums){
            xor = xor^ele;
        }
        int n = (xor&(xor-1))^xor;
        int b1 =0;
        int b2 =0;
        for(int ele: nums){
            if((ele&n)== 0) b1=b1^ele;
            else b2=b2^ele;
        }
        return new int[]{b1,b2};
    }
}