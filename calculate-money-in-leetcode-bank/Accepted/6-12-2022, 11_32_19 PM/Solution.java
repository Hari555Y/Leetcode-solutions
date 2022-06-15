// https://leetcode.com/problems/calculate-money-in-leetcode-bank

class Solution {
    public int totalMoney(int n) {
        int k=0,m=0,ans=0,i=1,j=1;
        while(n>0){
                ans=ans+i;
                n--;
                k++;
                i++;
                if(k==7){
                    k=0;
                    i=j+1;
                    j++;
                }
            }
        return ans;
    }
}