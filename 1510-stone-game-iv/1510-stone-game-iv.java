class Solution {

    int[] dp;

    public boolean winnerSquareGame(int n) {

        dp = new int[n + 1];

        return win(n);
    }

    boolean win(int n) {

        if (n == 0)
            return false;

        if (dp[n] != 0)
            return dp[n] == 1;

        for (int i = 1; i * i <= n; i++) {

            int square = i * i;

            if (!win(n - square)) {
                dp[n] = 1;
                return true;
            }
        }

        dp[n] = -1;
        return false;
    }
}