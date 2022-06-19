// https://leetcode.com/problems/decompress-run-length-encoded-list

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int  i =0; i<n; i++){
            if(i%2==0){
                count+=nums[i];
            }
        }
        int ans[] = new int[count];
        int tep =0;
        for(int i =0; i<n/2; i++){
           // int tep =0;
            for(int j=0; j<nums[2*i]; j++){
                ans[tep++] = nums[2*i+1];
            }
        }
        return ans;
        
    }
}