// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b)-> a.length()!=b.length() ? b.length()-a.length() : checker(a,b));
        return nums[k-1];
        
    }
    public static int checker(String a, String b){
        int n = a.length();
        for(int i =0 ; i<n; i++){
            if (a.charAt(i)>b.charAt(i)){
                return -1;
                
            }
            else  if (a.charAt(i)<b.charAt(i)){
                return 1;
                
            }
            
        }
        return 0;
    }
}