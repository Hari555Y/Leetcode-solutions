// https://leetcode.com/problems/trapping-rain-water-ii

class Solution {
    class Cell{
        int x;
        int y;
        int val;

        public Cell(int i, int j, int value){
            x = i;
            y = j;
            val = value;
        }
    }
    
    public int trapRainWater(int[][] hMap) {
        int n = hMap.length;
        int m = hMap[0].length;
        int result = 0;
        PriorityQueue<Cell> pq = new PriorityQueue<>((x, y) -> x.val  - y.val);

        boolean visited[][] = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            pq.add(new Cell(i, 0, hMap[i][0]));
            pq.add(new Cell(i, m - 1, hMap[i][m - 1]));
            visited[i][0] = true;
            visited[i][m - 1] = true;
        }

        for(int j = 1; j < m - 1; j++){
            pq.add(new Cell(0, j, hMap[0][j]));
            pq.add(new Cell(n - 1, j, hMap[n - 1][j]));
            visited[0][j] = true;
            visited[n - 1][j] = true;
        }

        int curr_max = 0;
        while(!pq.isEmpty()){
            Cell curr = pq.poll();
            int x = curr.x;
            int y = curr.y;
            int val = curr.val;

            curr_max = Math.max(curr_max, val);

            result += Math.max(curr_max - val, 0);

            if(x - 1 >= 0 && !visited[x - 1][y]) {
                pq.add(new Cell(x - 1, y, hMap[x - 1][y]));
                visited[x - 1][y] = true;
            }
            if(x + 1 < n && !visited[x + 1][y]) {
                pq.add(new Cell(x + 1, y, hMap[x + 1][y]));
                visited[x + 1][y] = true;
            }
            if(y - 1 >= 0 && !visited[x][y - 1]) {
                pq.add(new Cell(x, y - 1, hMap[x][y - 1]));
                visited[x][y - 1] = true;
            }
            if(y + 1 < m && !visited[x][y + 1]){
                pq.add(new Cell(x, y + 1, hMap[x][y + 1]));
                visited[x][y + 1] = true;
            } 
        }

        return result;
    }
}