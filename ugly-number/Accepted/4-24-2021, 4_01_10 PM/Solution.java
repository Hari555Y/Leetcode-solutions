// https://leetcode.com/problems/ugly-number

class Solution {
    public boolean isUgly(int n) {
        int temp =n;
        if (n==0){
            return false;
        }
        while(temp%5==0){
            temp=temp/5;
        }
        while(temp%3==0){
            temp=temp/3;
        }
        while(temp%2==0){
            temp=temp/2;
        }
        if (temp==1){
            return true;
        }
        return false;
        
        
    }
}