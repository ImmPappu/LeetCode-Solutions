class Solution {
    public int minLengthAfterRemovals(String s) {
        int[] freq = new int[2];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a') freq[0]++;
            else freq[1]++;
        }
        return Math.abs(freq[0]-freq[1]);
    }
}