class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        String st1 = Integer.toBinaryString(x);
        String st2 = Integer.toBinaryString(y);
        int n = Math.max(st1.length(),st2.length());

        st1 = String.format("%" + n + "s", st1).replace(' ', '0');
        st2 = String.format("%" + n + "s", st2).replace(' ', '0');

        for(int i=n-1;i>=0;i--){
            if(st1.charAt(i)!=st2.charAt(i)){
                count++;
            }
        }
        return count;
        // return Integer.bitCount(x^y);
    }
}