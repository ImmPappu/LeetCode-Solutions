class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }
            grid[i] = new String(row);
        }
        // Open the first row
        grid[0] = ".".repeat(n);

        // Open the last column
        for (int i = 1; i < m; i++) {
            grid[i] = grid[i].substring(0, n - 1) + ".";
        }

        return grid;

    }
}