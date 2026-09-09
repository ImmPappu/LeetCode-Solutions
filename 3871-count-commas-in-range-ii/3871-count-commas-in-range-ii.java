class Solution {
    public long countCommas(long n) {
        long ans = 0;
        if(n>=1000){
            ans += n-999;
        }
        if(n>=1000000){
            long count = n-999999;
            ans += count;
        }
        if(n>=1000000000){
            long count = n-999999999;
            ans += count;
        }
        if(n>=1000000000000L){
            long count = n-999999999999L;
            ans += count;
        }
        if(n >= 1000000000000000L) {
            long count = n - 999999999999999L;
            ans += count;
}
        return ans;
    }
}