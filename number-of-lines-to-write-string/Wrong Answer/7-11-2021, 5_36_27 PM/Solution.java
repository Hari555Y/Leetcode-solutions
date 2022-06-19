// https://leetcode.com/problems/number-of-lines-to-write-string

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        int count =0; int used =0;
        for (int i =0; i<s.length(); i++){
            used += widths[s.charAt(i)-'a'];
            if(used/100!=0){
                used = used%100;
                count++;
            }
        }
        arr[0] =count+1;
        arr[1] = used;
        return arr;
        
    }
}