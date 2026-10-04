class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        //0th row ke first column mei 0 hai toh flip kardo
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){ //flip that row 
                for(int j=0;j<n;j++){
                    arr[i][j]^= 1;
                }
            }
        }
        //har uss column ko flip jisme number of  0 jyda ho
       
        for(int j=0;j<n;j++){
            int zeros = 0, ones = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) zeros++;
                else ones++;
            }
            if(zeros>ones){
                for(int i=0;i<m;i++){
                    arr[i][j] ^=1;  //arr[i][j] = 1 -arr[i][j];
                }
            }
        }
        int sum = 0;
        int pow = 1;
        for(int j=n-1;j>=0;j--){
            int ones = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==1) ones++;
            }
            sum += pow*ones;
            pow *=2;
        }
        return sum;
    }
}