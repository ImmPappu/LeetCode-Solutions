class Solution {

    int[][] dp;
    int[] suffix;
    int[] piles;
    int n;

    public int stoneGameII(int[] piles) {
        this.piles = piles;
        n = piles.length;
        suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }
        dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        return solve(0, 1);
    }
    int solve(int index, int M) {
        if (2 * M >= n - index)
            return suffix[index];
        if (dp[index][M] != -1)
          return dp[index][M];
        int ans = 0;
        int taken = 0;
        for (int X = 1; X <= 2 * M && index + X <= n; X++) {
            taken += piles[index + X - 1];
            int newM = Math.max(M, X);
            int opponent = solve(index + X, newM);
            int current = taken + suffix[index + X] - opponent;
            ans = Math.max(ans, current);
        }
        return dp[index][M] = ans;
    }
}