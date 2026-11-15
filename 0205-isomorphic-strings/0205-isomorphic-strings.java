class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapST[ch1] != 0 || mapTS[ch2] != 0) {

                if (mapST[ch1] != ch2 || mapTS[ch2] != ch1) {
                    return false;
                }
            }
            else {
                mapST[ch1] = ch2;
                mapTS[ch2] = ch1;
            }
        }
        return true;
    }
}