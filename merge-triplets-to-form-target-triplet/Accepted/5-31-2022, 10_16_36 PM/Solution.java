// https://leetcode.com/problems/merge-triplets-to-form-target-triplet

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int n = triplets.length;
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            if (triplets[i][0] <= target[0]){
                arr[i]++;
            }
        }
        for(int i =0; i<n; i++){
            if (triplets[i][1] <= target[1]){
                arr[i]++;
            }
        }
        for(int i =0; i<n; i++){
            if (triplets[i][2] <= target[2]){
                arr[i]++;
            }
        }
        boolean a = false; boolean b = false; boolean c = false;
        for(int i =0; i<n; i++){
            if (triplets[i][0] == target[0] && arr[i] == 3){
                a = true;
            }
            if (triplets[i][1] == target[1] && arr[i] == 3){
                b = true;
            }
            if (triplets[i][2] == target[2] && arr[i] == 3){
                c = true;
            }
        }
        return a==true && b == true && c==true ? true : false;
        
        
    }
}