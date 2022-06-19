// https://leetcode.com/problems/count-primes

class Solution {
    public int countPrimes(int n) {
        if (n==1|| n==0 || n==2){
            return 0;
        }
        else{
            int count =0;
            for (int i=3; i<n; i++){
                if (isprime(i)){
                    count++;
                }
            }
            return count+1;
        }
        
    }
    public boolean primes(int k){
        for (int i =2; i*i<=k;i++){
            if(k%i==0){
                return true;
            }
            
        }
        return false;
        
    }
}