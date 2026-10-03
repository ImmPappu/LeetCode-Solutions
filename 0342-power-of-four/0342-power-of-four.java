class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return isPowerFour(n) && isPowerTwo(n);
    }
    public boolean isPowerFour(int n) {
        double root = (double)(Math.sqrt(n));
        return (root*root == n);
    }
    public boolean isPowerTwo(int n) {
        return ((n&(n-1))==0);
    }
}