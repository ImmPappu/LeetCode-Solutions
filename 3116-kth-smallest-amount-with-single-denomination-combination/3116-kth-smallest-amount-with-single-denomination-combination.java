class Solution {
    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
    long count(long x, int[] coins) {
        int n = coins.length;
        long ans = 0;
        // All subsets
        for (int mask = 1; mask < (1 << n); mask++) {
            long LCM = 1;
            int bits = 0;
            boolean tooBig = false;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    LCM = lcm(LCM, coins[i]);
                    if (LCM > x) {
                        tooBig = true;
                        break;
                    }
                }
            }
            if (tooBig) continue;
            long value = x / LCM;
            // Odd number of elements -> add
            // Even number -> subtract
            if (bits % 2 == 1) {
                ans += value;
            } else {
                ans -= value;
            }
        }
        return ans;
    }
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) coins[0] * k;
        // Find an upper bound
        for (int coin : coins) {
            high = Math.min(high, (long) coin * k);
        }
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}