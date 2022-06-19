// https://leetcode.com/problems/valid-mountain-array

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length==1 || arr.length==2){
            return false;
        }
        if (arr[1]<=arr[0]){
            return false;
        }
        if (arr[arr.length-1]>=arr[arr.length-2]){
            return false;
        }
        if (arr.length==3){
            return true;
        }
        int count = 0;
        for (int i =1; i<arr.length-1; i++){
            if ((arr[i]-arr[i-1])*(arr[i]-arr[i+1]) <0){
                count+=1;
            }
        }
        if (count==1){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}