class Solution {
    public int addDigits(int nums) {
        while(nums>=10){
            int sum = 0;
            while(nums>0){
                int digit = nums%10;
                sum = sum+digit;
                nums /=10;
            }
            nums = sum;
        }
        return nums ;    
    }
}