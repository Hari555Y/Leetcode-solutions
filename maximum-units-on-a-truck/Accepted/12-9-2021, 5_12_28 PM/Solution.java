// https://leetcode.com/problems/maximum-units-on-a-truck

class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        int n = box.length;
        Arrays.sort(box, (a,b)-> b[1]-a[1]);
        int count =0;
        int ans =0;
        for (int i =0; i<n; i++){
            ans += Math.min(truckSize, box[i][0])*box[i][1];
            truckSize -=box[i][0];
            if (truckSize <0){
                truckSize =0;
            }
        }
        
        return ans;
    }
}