// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ls = new LinkedList<>();
        HashSet<Integer> hash = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            if (nums[i] ==key){
                for(int j =i; j<=i+k && j<nums.length ; j++){
                    if (!hash.contains(j)){
                        hash.add(j);
                        ls.add(j);
                    }
                }
                for(int j =i; j>=i-k && j>=0 ; j--){
                    if (!hash.contains(j)){
                        hash.add(j);
                        ls.add(j);
                    }
                }
            }
        }
        Collections.sort(ls); return ls;
        
    }
}