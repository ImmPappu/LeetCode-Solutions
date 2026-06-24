class Solution {
    public List<List<Integer>> generate(int n) {
         List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) arr.get(i).add(1);
                else if (j == i) arr.get(i).add(1);
                else arr.get(i).add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
            }
        }

        return arr;
    }
}