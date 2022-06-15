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
                if(v[j]<=v[j-1]){
                     v = nums;
                    continue;
                    //return false;
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