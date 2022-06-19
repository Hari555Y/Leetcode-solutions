// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count =0;
        int n = seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i =0; i<n; i++){
            count += Math.abs(seats[i]-students[i]);
            
        }
        return count;
    }
}