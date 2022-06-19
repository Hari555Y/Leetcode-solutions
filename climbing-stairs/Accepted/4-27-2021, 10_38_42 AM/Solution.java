// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int f = 1; int s = 2;int sum =0;
        for (int i =3; i<=n; i++){
            sum = f+s;
            f = s;
            s = sum;
            
        }
        return sum;
  //      else{
    //        return climbStairs(n-1) + climbStairs(n-2);
      //  }
        
    }
}