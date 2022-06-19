// https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree

class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<int[]> weights = new ArrayList<>();
        for (int[] edge : edges) {
            weights.add(edge);
        }
        Collections.sort(weights, (w1, w2) -> Integer.compare(w1[2], w2[2]));
        
        List<Integer> critical = new ArrayList<>();
        List<Integer> pseudo = new ArrayList<>();
        int minCost = costOfMST(n, weights, null, null);
        for (int i = 0; i < edges.length; ++i) {
            int[] edge = edges[i];
            if (costOfMST(n, weights, null, edge) > minCost) {
                critical.add(i);
            } else if (costOfMST(n, weights, edge, null) == minCost) {
                pseudo.add(i);
            }
        }
        return Arrays.asList(critical, pseudo);
    }
    
    private int costOfMST(int n, List<int[]> edges, int[] required, int[] avoid) {
        int cost = 0;
        DSU dsu = new DSU(n);
        if (required != null) {
            dsu.union(required[0], required[1]);
            cost += required[2];
        }
        for (int[] edge : edges) {
            if (edge != avoid && dsu.union(edge[0], edge[1])) {
                cost += edge[2];
            }
            if (dsu.size == 1) {
                return cost;
            }
        }
        return Integer.MAX_VALUE;
    }
    
    static class DSU {
        private int[] parents;
        private int[] rank;
        private int size;

        public DSU(int size) {
          this.size = size;
          parents = new int[size];
          rank = new int[size];
          for (int i = 0; i < size; ++i) {
            parents[i] = i;
            rank[i]=0;
          }
        }

        public boolean union(int x, int y) {
          int parentX = find(x);
          int parentY = find(y);
          if (parentX == parentY) {
            return false;
          }

          if (rank[parentX] < rank[parentY]) {
            parents[parentX] = parentY;
          }
          else {
            parents[parentY] = parentX;
            if (rank[parentX] == rank[parentY]) {
                ++rank[parentX];
            }
          }

          --size;
          return true;
        }

        public int find(int x) {
            if (parents[x]==x){return x;}
            else{
                return parents[x] = find(parents[x]);
            }
        }
    }
}