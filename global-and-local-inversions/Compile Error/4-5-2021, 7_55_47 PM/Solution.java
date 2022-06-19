// https://leetcode.com/problems/global-and-local-inversions

class Solution {
    public boolean isIdealPermutation(int[] A) {
        int sum , count =0;
        for (int i =0; i<A.length-1; i++){
            for (int j =i+1; j<A.length; j++){
                if (A[i]>A[j]){
                    count+=1;
                }
                
            }
        }
        for (int i =0; i<A.length-1; i++){
                if (A[i]>A[i+1]){
                    sum+=1;
                }
        }
        if (count==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}