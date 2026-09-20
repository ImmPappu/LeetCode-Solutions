class Solution {
    public int reverseDegree(String s) {
        int[] revIndex = new int[26];
        int index = 26;
        for(int i=0;i<26;i++){
            revIndex[i] = index;
            index--;
        }
        int sum =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int revIn = revIndex[ch - 'a'];
            sum = sum + revIn*(i+1);
        }
        return sum;
    }
}