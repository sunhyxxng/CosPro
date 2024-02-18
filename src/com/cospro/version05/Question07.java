package com.cospro.version05;

public class Question07 {
    public int find(int[] parent, int u) {
        if (u == parent[u]) {
            return u;
        }
        find(parent, parent[u]);
        return parent[u];
    }

    public boolean merge(int[] parent, int u, int v) {
        u = find(parent, u);
        v = find(parent, v);

        if (u == v) {
            return true;
        }
        parent[v] = u;
        return false;
    }

    public int solution(int n, int[][] connections) {
        int answer = 0;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < connections.length; i++) {
            if (merge(parent, connections[i][0], connections[i][1])) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question07 sol = new Question07();
        int n = 3;
        int[][] connections = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(sol.solution(n, connections));
    }
}
