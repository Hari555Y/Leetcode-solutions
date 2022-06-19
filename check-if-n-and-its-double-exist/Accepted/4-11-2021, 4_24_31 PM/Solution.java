// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i =0; i<arr.length; i++ ){
            HashSet<Integer> su = new HashSet<>();
            for (int j=0; j<=i-1;j++ ){
                su.add(arr[j]);
                
            }
            if ((arr[i]%2==0 && su.contains(arr[i]/2))|| su.contains(arr[i]*2)){
                return true;
            }
        }
        return false;
        
    }
}