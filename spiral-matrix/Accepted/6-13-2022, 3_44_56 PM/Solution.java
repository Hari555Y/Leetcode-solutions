// https://leetcode.com/problems/spiral-matrix

class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        List<Integer> ans = new ArrayList<Integer>();
        int rows = 0; int cols = 0; int rowe= A.length -1; int cole=A[0].length-1;
       // int count =1;
        while(rows<=rowe&&cols<=cole){
            for (int i =cols; i<=cole; i++){
                //ans.get(rows).set(i,count++);
                ans.add(A[rows][i]);
            }
            rows++;
            for (int j =rows; j<=rowe; j++){
                //ans.get(cole).set(j, count++);
                //ans.get(j).set(cole,count++);
                ans.add(A[j][cole]);
            }
            cole--;
           if(cols<=cole && rows <=rowe){
                if(cols<=cole){
                    for (int k = cole; k>=cols; k--){
                       // ans.get(rowe).set(k, count++);
                        //ans.get(rowe).set(k,count++);
                        ans.add(A[rowe][k]);
                    }
                }
                rowe--;
                if(rowe>=rows){
                    for (int r = rowe; r>=rows; r--){
                       // ans.get(cols).set(r, count++);
                       //ans.get(r).set(cols,count++);
                       ans.add(A[r][cols]);
                    }
                }
                cols++;
                
            }
        }
        return ans;
        
    }
}