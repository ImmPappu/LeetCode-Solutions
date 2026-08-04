class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> ls = new ArrayList<>();

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        int idx=0;
        
        for (int i = min; i <= max; i++) {
            if (idx < arr.length && i == arr[idx]) {
                idx++;
            } else {
                ls.add(i);
            }
        }
        return ls;

    }
}