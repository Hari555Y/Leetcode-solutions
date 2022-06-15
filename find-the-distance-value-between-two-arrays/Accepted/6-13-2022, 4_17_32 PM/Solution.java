// https://leetcode.com/problems/find-the-distance-value-between-two-arrays

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);int count =0;
        for(int i : arr1){
            boolean bool = false;
            for(int j = -1*d; j<=d; j++){
                if (Arrays.binarySearch(arr2, i+j)>=0){
                    System.out.println(i+j);
                    bool = true;
                    break;
                }
            }
            if(bool == false){
                count++;
                
            }
        }
        return count;
        
    }
}