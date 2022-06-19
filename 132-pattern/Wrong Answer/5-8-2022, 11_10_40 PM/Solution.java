// https://leetcode.com/problems/132-pattern

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int currmin = nums[0];
        st.push(nums[0]);
        for(int i =1; i<nums.length; i++){
            while(st.size()>0 && st.peek()<=nums[i]){
                int n = st.peek();
                currmin = Math.min(n, currmin);
                st.pop();
                
            }
            if (st.size()>0){
                if (nums[i]<currmin){
                    return true;
                }
            }
            st.push(nums[i]);
                
        }
        return false;
        
        
        
    }
}