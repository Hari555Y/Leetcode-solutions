// https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<Integer>();
        //int[] target = new int[nums.length];
        for (int i=0; i< nums.length;i++){
            target.add(index[i] ,nums[i]);
        }
        int[] myarr = new int[target.size()];
        for (int u =0; u<target.size(); u++){
            myarr[u] = target.get(u);
        }
        //myarr = target.toArray(myarr);
        return myarr;
        
        
    }
}