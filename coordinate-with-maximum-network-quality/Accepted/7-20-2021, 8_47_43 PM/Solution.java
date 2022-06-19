// https://leetcode.com/problems/coordinate-with-maximum-network-quality

class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        for(int[] tower : towers) {
            minX = Math.min(minX, tower[0]);
            maxX = Math.max(maxX, tower[0]);
            minY = Math.min(minY, tower[1]);
            maxY = Math.max(maxY, tower[1]);
        }
        
        int ansX = 0, ansY = 0, maxQuality = 0;
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                int q = quality(towers, new int[]{i, j}, radius);
                if(q > maxQuality) {
                    maxQuality = q;
                    ansX = i;
                    ansY = j;
                }
            }
        }
        
        return new int[]{ansX, ansY};
    }
    
    private int quality(int[][] towers, int[] p, int radius) {
        int totalQuality = 0;
        for(int[] tower : towers) {
            totalQuality += quality2(tower, p, radius);
        }
        
        return totalQuality;
    }
    
    private int quality2(int[] tower, int[] p, int radius) {
        double d = Math.sqrt((p[0] - tower[0]) * (p[0] - tower[0]) + (p[1] - tower[1]) * (p[1] - tower[1]));
        if(d > radius) return 0;
        
        return (int)(tower[2] / (1 + d));
    }
}