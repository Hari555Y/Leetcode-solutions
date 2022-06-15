// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing

class Solution {
public:
    bool canBeIncreasing(vector<int>& nums) {
        vector<int> v = nums;
        for(int i =0 ; i<nums.size() ; i++){
            v.erase(v.begin() + i);
            vector<int> s = v;
            sort(s.begin() , s.end());
            for(int j= 1; j<s.size() ; j++){
                if(s[j]<=s[j-1]){
                    //continue;
                    return false;
                }
                
            }
            if (s==v){
                return true;
            }
            v = nums;
            
        }
        return false;
        
    }
    
};