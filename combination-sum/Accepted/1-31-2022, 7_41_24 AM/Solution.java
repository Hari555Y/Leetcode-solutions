// https://leetcode.com/problems/combination-sum

class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        help(0,target,candidates,ans,arr);
        return ans;
        
    }
    public void help(int i,int target,int[]ar,List<List<Integer>> ans, List<Integer> arr){
       // List<Integer> arr=new ArrayList<>();
        if(i==ar.length){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(target>=ar[i]){
            arr.add(ar[i]);
            help(i,target-ar[i],ar,ans,arr);
            arr.remove(arr.size()-1);
        }
        help(i+1,target,ar,ans,arr);
    }
}