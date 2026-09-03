class Solution {
    public boolean uniformArray(int[] num1) {
        int n = num1.length;
        int min = Integer.MAX_VALUE;
        boolean odd = false;
        boolean even = false;

        for(int i = 0; i < n; i++) {
            min = Math.min(min, num1[i]);
            if(num1[i] % 2 == 0)  even = true;
            else odd = true;
        }
        // Agar saare elements same parity ke hain
        if(!odd || !even) {
            return true;
        }
        // Agar odd + even dono hain,
        // minimum odd hona chahiye
        if(min % 2 == 0) {
            return false;
        }
        return true;
    }
} 