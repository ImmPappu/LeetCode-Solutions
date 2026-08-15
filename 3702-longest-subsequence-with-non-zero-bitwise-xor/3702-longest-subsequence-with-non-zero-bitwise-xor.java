class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean nonZero = false;
        for (int num : nums) {
            xor =xor^num;
            if (num != 0) {
                nonZero = true;
            }
        }
        // Whole array ka XOR non-zero
        if (xor != 0) {
            return nums.length;
        }
        // XOR zero hai, lekin non-zero element available hai
        if (nonZero) {
            return nums.length - 1;
        }
        // Saare elements zero hain
        return 0;
    }
}
