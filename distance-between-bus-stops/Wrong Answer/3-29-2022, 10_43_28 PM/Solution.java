// https://leetcode.com/problems/distance-between-bus-stops

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int count =0;
        int s1 =0;
        for(int i : distance){
            count+=i;
            
        }
        for(int j =start; j<destination; j++){
            s1+=distance[j];
        }
        return Math.min(s1, count-s1);
        
    }
}