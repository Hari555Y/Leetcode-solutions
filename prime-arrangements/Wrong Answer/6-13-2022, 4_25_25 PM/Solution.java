// https://leetcode.com/problems/prime-arrangements

class Solution {
    static int mod = 1000000007;
    public int numPrimeArrangements(int n) {
        int c =0;
        for(int i = 1; i<=n ; i++){
            if(isprime(i)){
                c++;
            }
        }
        return ((fact(c)%mod)*(fact(n-c)%mod))%mod;    
    }
    public static boolean isprime(int n){
        if (n==0 || n==1){
            return false;
        }
        if (n==2){
            return true;
        }
        for(int i =2; i<n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        return ((fact(n-1)%mod)*n)%mod;
    }
}