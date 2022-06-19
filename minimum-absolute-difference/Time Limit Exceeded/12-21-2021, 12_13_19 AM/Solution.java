// https://leetcode.com/problems/minimum-absolute-difference

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int  n = arr.length;
        int max = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                max = Math.min(max, Math.abs(arr[i]-arr[j]));
            }
        }
        for(int i =0; i <n; i++){
            for(int j = i+1; j<n; j++){
                if (Math.abs(arr[i]-arr[j])==max){
                    List<Integer> ls = new ArrayList<>(Arrays.asList(arr[i], arr[j]));
                    Collections.sort(ls);
                    ans.add(ls);
                }
            }
        }
        Collections.sort(ans, (a,b)->(a.get(0)!=b.get(0))? a.get(0)-b.get(0) : a.get(1)-b.get(1));
        return ans;
    }
}