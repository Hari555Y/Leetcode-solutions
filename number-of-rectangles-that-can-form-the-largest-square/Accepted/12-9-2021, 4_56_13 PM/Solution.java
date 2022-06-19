// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square

class Solution {
    public int countGoodRectangles(int[][] rec) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        for (int[] ar : rec){
            int a = ar[0];
            int b = ar[1];
            max = Math.max(max, Math.min(a,b));
            arr.add(Math.min(a,b));     
        }
        int count =0;
        for (int i =0; i<arr.size(); i++){
            if (arr.get(i)==max){
                count++;
            }
        }
        return count;
    }
}