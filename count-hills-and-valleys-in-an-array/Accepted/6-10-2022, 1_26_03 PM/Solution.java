// https://leetcode.com/problems/count-hills-and-valleys-in-an-array

class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        if (n==1){
            return 0;
        }
        int count =0;
        Stack<Integer> st = new Stack<>();
            if (nums[1] > nums[0]){
                st.push(1);
            }
            if (nums[1]<nums[0]){
                st.push(0);
            }
        for(int i= 2; i<n; i++){
            int cm = -1000;
            if (nums[i] > nums[i-1]){
              cm = 1 ;//  st.push(1);
            }
            else if (nums[i]<nums[i-1]){
               cm = 0; // st.push(0);
            }
            if (st.isEmpty()){
                if (cm>=0)
                    st.push(cm);
            }
            else{
            if (st.peek() + cm ==1){
                st.pop();
                st.push(cm);
                count++;
            }       }    
       }
        return count;        
    }
}