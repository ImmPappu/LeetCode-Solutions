class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum = leftSum + num.charAt(i) - '0';
            }
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum = rightSum + num.charAt(i) - '0';
            }
        }
        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;
        // Same number of ? on both sides
        if (qDiff == 0) {
            return diff != 0;  
        }
        // Odd difference of ? mark ALice can win 
        if (Math.abs(qDiff) % 2 == 1) {
            return true;
        }
        // Bob can balance only in this exact case
        if (diff == -9 * qDiff / 2) {
            return false;
        }
        return true;
    }
}