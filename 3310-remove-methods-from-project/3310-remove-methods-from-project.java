class Solution {

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] edge : invocations)
            graph[edge[0]].add(edge[1]);

        boolean[] suspicious = new boolean[n];
        dfs(k, graph, suspicious);

        // If a normal method calls a suspicious method,
        // no methods can be removed.
        for (int[] edge : invocations) {
            if (!suspicious[edge[0]] && suspicious[edge[1]]) {
                List<Integer> answer = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    answer.add(i);
                return answer;
            }
        }

        // Store all methods that are not suspicious
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i])
                answer.add(i);
        }

        return answer;
    }

    void dfs(int method, List<Integer>[] graph, boolean[] suspicious) {
        suspicious[method] = true;

        for (int nextMethod : graph[method]) {
            if (!suspicious[nextMethod])
                dfs(nextMethod, graph, suspicious);
        }
    }
}