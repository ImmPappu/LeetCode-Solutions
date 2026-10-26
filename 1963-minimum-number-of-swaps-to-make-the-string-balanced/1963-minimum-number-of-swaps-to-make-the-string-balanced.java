class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int maxbalance = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='['){
                balance++;
            }
            else{
                balance--;
            }
            maxbalance = Math.max(-balance,maxbalance);
        }
        return (maxbalance+1) / 2 ;
    }
}