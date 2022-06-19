// https://leetcode.com/problems/trapping-rain-water

class Solution {
    public int trap(int[] height) {
        List<Integer> A = new ArrayList<>();
        for (int  i : height){
            A.add(i);
        } 
        int max = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE;
        int[] lmax =  new int[A.size()];
        int[] rmax =  new int[A.size()];
        for (int i =0; i<A.size();i++ ){
            max = Math.max(max,A.get(i));
            lmax[i]= max;
        }
        for (int i =A.size()-1; i>=0;i-- ){
            max2 = Math.max(max2,A.get(i));
            rmax[i]= max2;
        }
        int count =0;
        for (int i =1; i<A.size()-1; i++){
            count += Math.min(lmax[i],rmax[i])- A.get(i);
            
        }
        return count;
    }
}