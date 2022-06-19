// https://leetcode.com/problems/minimum-absolute-difference

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int  n = arr.length;
        int max = Integer.MAX_VALUE;
        for(int i =0; i<n-1; i++){
                max = Math.min(max, Math.abs(arr[i+1]-arr[i]));
        }
        for(int i =0; i <n-1; i++){
                if (Math.abs(arr[i+1]-arr[i])==max){
                    ans.add(Arrays.asList(arr[i], arr[i+1]));
                }
        }
        return ans;
    }
}