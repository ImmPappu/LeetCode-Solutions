class Solution {
    int[][] dp;
    int[] prefix;
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        if (n == 1) {
            return 0;
        }
        dp = new int[n][n];
        prefix = new int[n + 1];
        // Prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }
        return solve(stoneValue, 0, n - 1);
    }
    public int solve(int[] stoneValue, int l, int r) {
        // Only one stone
        if (l == r) {
            return 0;
        }
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        int ans = 0;
        // Try every possible split
        for (int k = l; k < r; k++) {
            int leftSum = prefix[k + 1] - prefix[l];
            int rightSum = prefix[r + 1] - prefix[k + 1];
            if (leftSum < rightSum) {
                ans = Math.max(ans,leftSum + solve(stoneValue, l, k));
            } 
            else if (rightSum < leftSum) {
                ans = Math.max(ans, rightSum + solve(stoneValue, k + 1, r));
            } 
            else {
                ans = Math.max(ans,
                        Math.max(leftSum + solve(stoneValue, l, k),
                        rightSum + solve(stoneValue, k + 1, r)
                        )
                    );
            }
        }
        dp[l][r] = ans;
        return ans;
    }
}