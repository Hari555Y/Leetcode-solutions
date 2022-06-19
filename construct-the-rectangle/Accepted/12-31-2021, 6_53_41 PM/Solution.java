// https://leetcode.com/problems/construct-the-rectangle

class Solution {
    public int[] constructRectangle(int area) {
        int[]  ams = new int[2];
        for(int i =(int)Math.sqrt(area); i>=1; i--){
           // System.out.print(i);
            if(area%i==0){
                ams[1] = i;
                ams[0] = area/i;
                return ams;
            }
            
        }
        return ams;
    }
}