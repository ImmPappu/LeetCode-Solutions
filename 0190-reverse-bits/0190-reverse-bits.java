class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s",
            Integer.toBinaryString(n)).replace(' ', '0');
        String t = new StringBuilder(s).reverse().toString();
        int ans = 0;
        for(int i=t.length()-1;i>=0;i--){
            if(t.charAt(i)=='1'){
                ans |= (1 << (31 - i));
            }
        }
        return ans;
    }
}