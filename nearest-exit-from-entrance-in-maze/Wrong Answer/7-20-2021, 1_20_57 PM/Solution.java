// https://leetcode.com/problems/nearest-exit-from-entrance-in-maze

class Solution {
    int[] dx = {0, -1, 0, 1};
    int[] dy = {1, 0, -1, 0};
    public int nearestExit(char[][] maze, int[] entrance) {
        int xcor = entrance[0];
        int ycor = entrance[1];
        int m =maze.length;
        int n  = maze[0].length;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(xcor, ycor, 0));
        maze[xcor][ycor] ='+';
        while(!q.isEmpty()){
            int siz = q.size();
            for (int i =0; i<siz; i++){
                pair top = q.peek();
                q.poll();
                for (int you =0; you<4; you++){
                    int newx = top.x + dx[you];
                    int newy = top.y + dx[you];
                    if (newx >=0 && newy>=0 && newx<m && newy < n && maze[newx][newy] == '.'){
                        if (newx==0 || newy ==0 || newx ==m-1 || newy == n-1){
                            return top.lev+1;
                        }
                        q.add( new pair(newx, newy , top.lev+1));
                        maze[newx][newy] ='+';
                    }
                    
                }
                
            } 
        }
        return -1;
        
        
    }
    class pair{
        int x; int y; int lev;
        public pair(int x, int y, int lev){
            this.x=x;
            this.y= y;
            this.lev = lev;
        }
    }
}
/*class Solution {
public:
    int nearestExit(vector<vector<char>>& maze, vector<int>& entrance) {
        vector<vector<int>>directions={{1,0},{0,1},{-1,0},{0,-1}};
        int r=maze.size();
        int c=maze[0].size();
        queue<int>x;
        queue<int>y;
        x.push(entrance[0]);
        y.push(entrance[1]);
        maze[entrance[0]][entrance[1]]='+';
        int count=0;
        
        while(!x.empty())
        {
            int n=x.size();
            
            for(int i=0;i<n;i++)
            {
                int l=x.front();
                int m=y.front();
                
                x.pop();
                y.pop();

                for(int k=0;k<4;k++)
                {
                    int a=l+directions[k][0];
                    int b=m+directions[k][1];
                    
                    if(a>=0 && b>=0 && a<r && b<c && maze[a][b]=='.')
                    {
                        if(a==0 || b==0 || a==r-1 || b==c-1)
                            return count+1;
                        x.push(a);
                        y.push(b);
                        maze[a][b]='+';
                    }
                }
            }
            
            count++;
        }
        
        return -1;
    }
};*/