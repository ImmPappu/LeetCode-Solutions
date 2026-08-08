class Solution {
  public int[] validSequence(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    // right[i] = position where word2[i] can be matched
    // while matching word2 from right to left
    int[] right = new int[m];
    int j = n - 1;
    for (int i = m - 1; i >= 0; i--) {
        while (j >= 0 && word1.charAt(j) != word2.charAt(i)) {
            j--;
        }
        right[i] = j;
        if (j >= 0) {
            j--;
        }
    }
    int[] ans = new int[m];
    int j1 = 0;
    boolean wrongUsed = false;
    for (int i = 0; i < n && j1 < m; i++) {
        // Same character
        if (word1.charAt(i) == word2.charAt(j1)) {
            ans[j1] = i;
            j1++;
        }
        // Different character
        else if (!wrongUsed &&
                 (j1 == m - 1 || i < right[j1 + 1])) {
            ans[j1] = i;
            j1++;
            wrongUsed = true;
        }
    }
    if (j1 != m) {
        return new int[0];
    }
    return ans;
}
}