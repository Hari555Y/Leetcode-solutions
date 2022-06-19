// https://leetcode.com/problems/coordinate-with-maximum-network-quality

class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int minX,minY,maxX,maxY;
        minX=minY=Integer.MAX_VALUE;
        maxY=maxX=Integer.MIN_VALUE;
        
        if (towers.length == 1 && towers[0][2]!=0)
        {
            int[] arr = new int[2];
            arr[0]=towers[0][0];
            arr[1]=towers[0][1];
            return arr;
        }
        
        else if (towers.length == 1 && towers[0][2]==0)
        {
            int[] arr = new int[2];
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
        for (int i=0;i<towers.length;i++)
        {
            minX = Math.min(minX , towers[i][0]);
            maxX = Math.max(maxX , towers[i][0]);
            
            minY = Math.min(minY , towers[i][0]);
            maxY = Math.max(maxY , towers[i][0]);
        }
        
        minX-=radius;
        maxX+=radius;
        
        minY-=radius;
        maxY+=radius;
        
        if (minX < 0)
            minX=0;
        
        if (minY < 0)
            minY=0;
        
        int maxQuality = Integer.MIN_VALUE;
        int[] ans=new int[2];
        int quality=0;
        for (int i=minX;i<=maxX;i++)
            for (int j=minY;j<=maxY;j++)
            {
                quality=0;
                for (int k=0;k<towers.length;k++)
                {
                    double dist = Math.sqrt( Math.pow((i-towers[k][0]),2) +
                                         Math.pow((j-towers[k][1]),2));
                    
                    if (dist <= (double)radius)
                     quality += (int)Math.floor(towers[k][2]/(1+dist));      
                }
                if (quality > maxQuality)
                        {
                            maxQuality = quality;
                            ans[0] = i;
                            ans[1] = j;
                        }
                
                else if (quality == maxQuality && i<ans[0])
                        {
                            ans[0] = i;
                            ans[1] = j;
                        }
                
                else if (quality==maxQuality && i==ans[0] && j<ans[1])
                        {
                            ans[0] = i;
                            ans[1] = j;
                        }
            }
        
        return ans;
    }
}