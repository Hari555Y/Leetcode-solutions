// https://leetcode.com/problems/find-the-difference-of-two-arrays

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ls1 =  new ArrayList<>();
        List<Integer> ls2 =  new ArrayList<>();
        for(int i :  nums1){
            if (Arrays.binarySearch(nums2, i)<0){
                System.out.println(Arrays.asList(nums2).indexOf(i));
                ls1.add(i);
            }
            
        }
        for(int j  : nums2){
            if (Arrays.binarySearch(nums1, j)<0){
                System.out.println(Arrays.asList(nums1).indexOf(j));
                ls2.add(j);
            }
            
        }
        ls.add(ls1);
        ls.add(ls2);
        return ls;
        
        
    }
}