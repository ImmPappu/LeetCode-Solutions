import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Store reserved seats row-wise
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            int mask = map.getOrDefault(row, 0);
            // seat number 1 -> bit 0
            mask |= (1 << col);
            map.put(row, mask);
        }
        int ans = 0;
        // Rows having reserved seats
        for (int mask : map.values()) {
            // seats 2,3,4,5
            boolean left = (mask & (1 << 2)) == 0 &&
                           (mask & (1 << 3)) == 0 &&
                           (mask & (1 << 4)) == 0 &&
                           (mask & (1 << 5)) == 0;
            // seats 6,7,8,9
            boolean right = (mask & (1 << 6)) == 0 &&
                            (mask & (1 << 7)) == 0 &&
                            (mask & (1 << 8)) == 0 &&
                            (mask & (1 << 9)) == 0;
            // seats 4,5,6,7
            boolean middle = (mask & (1 << 4)) == 0 &&
                             (mask & (1 << 5)) == 0 &&
                             (mask & (1 << 6)) == 0 &&
                             (mask & (1 << 7)) == 0;
            if (left && right) {
                // Two groups
                ans += 2;
            }
            else if (left || middle || right) {
                // At least one group
                ans += 1;
            }
        }
        // Rows without any reserved seats
        // can always accommodate 2 groups.
        ans += (n - map.size()) * 2;
        return ans;
    }
}