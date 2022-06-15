// https://leetcode.com/problems/4sum


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (nums.length < 4) return ans; 
        
        Arrays.sort(nums);
        
        int len = nums.length; 
        
        for (int i=0; i<len-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; 
            
            for (int j=i+1; j<len-2; j++) { 
            
                if (j>i+1 && nums[j] == nums[j-1]) continue;
                
                int left = j+1; 
                int right = len-1; 
                
                while(left < right) { 
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; 
                    
                    if (sum > target) { 
                        right -= 1; 
                        while(right > left && nums[right] == nums[right+1]) right -= 1;
                    }
                    else if (sum < target) { 
                        left += 1; 
                        while(left < right && nums[left] == nums[left-1]) left += 1; 
                    } 
                    else { 
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        left += 1; 
                        right-=1;
                        while(left < right && nums[left] == nums[left-1]) left += 1;
                        while(right>left && nums[right]==nums[right+1]) right-=1;
                    }
                }
            }
        }
        
        return ans; 
    }
}