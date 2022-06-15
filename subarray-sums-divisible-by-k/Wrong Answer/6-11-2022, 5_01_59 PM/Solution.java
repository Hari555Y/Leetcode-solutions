// https://leetcode.com/problems/subarray-sums-divisible-by-k

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int[] rem = new int[n];
        int sum =0;
        for(int i =0 ; i<n; i++){ sum += nums[i];
            rem[i] = sum%k;
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int count =0;
        for(int i =0 ; i<n; i++){
            if(hash.containsKey(rem[i])){
                count += hash.get(rem[i]);
            }
            hash.put(rem[i], hash.getOrDefault(rem[i], 0)+1);
        }
        return count;
    }
}


// [4,2,6, 7, 8]
 //       4, 6, 12, 19, 27
   //   0  2, 0 , 3, 3
// 4