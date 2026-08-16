class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int stone : stones){
            if(stone%3==0) count0++;
            if(stone%3==1) count1++;
            if(stone%3==2) count2++;
        }
        if(count1 ==0) {
            return count2 >= 3 && count0 % 2 == 1;
        } 
        if(count2 ==0) {
            return count1 >= 3 && count0 % 2 == 1;
        } 
        if(count0 % 2 ==0){ //Even number of remainder-0 stones means Alice has a winning strategy.
            return true;
        }
        return (Math.abs(count1 - count2) > 2); // // If count0 is odd, the difference between type-1 and type-2 stones decides the result.
    }
}