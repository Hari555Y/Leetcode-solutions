// https://leetcode.com/problems/min-cost-to-connect-all-points

class Solution {
    int parent[],rank[];
    class Pair{
        int x,y,z;
        Pair(int x,int y,int z)
        {
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
            
        }
        Pair arr[]=new Pair[(n*(n-1))/2];
        int k=0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                int dis=Math.abs(points[j][0]-points[i][0])+Math.abs(points[j][1]-points[i][1]);
                arr[k++]=new Pair(i,j,dis);
            }
        }
        Arrays.sort(arr,(a,b)->(a.z-b.z));
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            Pair p=arr[i];
            int u=find(p.x);
            int v=find(p.y);
            if(u!=v)
            {
                res+=p.z;
                union(u,v);
                //s++;
            }
        }
        return res;
    }
    public int find(int x)
    {
        if(parent[x]==x)
            return x;
        return parent[x]=find(parent[x]);
    }
    public void union(int x,int y)
    {
        if(rank[x]<rank[y])
            parent[x]=y;
        else if(rank[x]>rank[y])
            parent[y]=x;
        else
        {
            parent[x]=y;
            rank[y]++;
        }
    }
}