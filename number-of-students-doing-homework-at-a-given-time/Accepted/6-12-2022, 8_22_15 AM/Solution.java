// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time

class Solution {
    public int busyStudent(int[] st, int[] e, int qt) {
        int count =0;
        int n = st.length;
        for(int i =0; i<n ; i++){
            if (qt>=st[i] && qt<=e[i]){
                count++;
            }
        }
        return count;
        
    }
}