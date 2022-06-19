// https://leetcode.com/problems/count-primes

class Solution {
    public int countPrimes(int n) {
        int[] myarr = new int[n];
        for (int i =0; i<n; i++){
            myarr[i] =0;
        }
      //  myarr[0] =0;
      //  myarr[1]=0;
        int tape=0;
        for (int i =2; i<n; i++){
            if(myarr[i]==0){
                tape++;
                for (int j =2; j*i<n;j++){
                    myarr[i*j]=1;
                }
                
            }
            
            
        }
        return tape;
        
        
    }
}