class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=num/2;i++){
            if(num%i==0) ans.add(i);
        }
        int sum = 0;
        for(int ele : ans){
            sum +=ele;
        }
        return sum==num;
    }
}