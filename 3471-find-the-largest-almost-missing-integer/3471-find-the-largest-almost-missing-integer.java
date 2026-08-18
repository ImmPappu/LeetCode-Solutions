class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        // k == n
        if (k == n) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        // k == 1
        if (k == 1) {
            int[] freq = new int[51]; //constraint 0 se 50 hi hai
            for (int num : nums) {
                freq[num]++;
            }
            int max = -1;
            for (int num = 0; num <= 50; num++) {
                if (freq[num] == 1) max = num;
            }
            return max;
        }
        // 1 < k < n

        int first = nums[0];
        int last = nums[n - 1];

        int firstCount = 0;
        int lastCount = 0;
        for (int num : nums) {
            if (num == first) firstCount++;
            if (num == last) lastCount++;
        }
        boolean firstValid = firstCount == 1;
        boolean lastValid = lastCount == 1;

        if (firstValid && lastValid) return Math.max(first, last);
        if (firstValid) return first;
        if (lastValid) return last;
        return -1;
    }
}