class Solution {
    public int totalNQueens(int n) {
        char[][] chessboard = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Arrays.fill(chessboard[i], '.');
        }
        nQueen(0,chessboard,ans);
        return ans.size();
    }

    private static void nQueen(int row, char[][] chessboard ,List<List<String>> ans) {
        int n = chessboard.length;
        if (row == n) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                board.add(new String(chessboard[i]));
            }
            ans.add(board) ;              
        }
        for(int col=0;col<n;col++){
            if(canQueenBePlaced(row,col,chessboard)){
                chessboard[row][col] = 'Q';  //Mark
                nQueen(row+1,chessboard,ans);
                chessboard[row][col] = '.';
            }
        }
    }

    private static boolean canQueenBePlaced(int row, int col, char[][] chessboard) {
        int n = chessboard.length;
        //Check Col
        int i = row-1;
        while(i>=0){
            if(chessboard[i][col]=='Q') return false;
            i--;
        }
        //Check left Diagonal  (niche se cross left upar toh row aur col kam honge)
        i = row-1;
        int j = col-1;
        while(i>=0  && j>=0){
            if(chessboard[i][j]=='Q') return false;
            i--;
            j--;
        }
        //Check Right Diagonal  (niche se cross right upar toh row kam hoga aur col badhega )
        i = row-1;
        j = col+1;
        while(i>=0  && j<n){
            if(chessboard[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
}