// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
     //   Arrays.sort(nums1);
   //     Arrays.sort(nums2);
        int sak=0;
        while (sak<nums1.length){
            int tape = nums1[sak];
            int rope =0; 
            while(nums2[rope] !=tape){
                rope++;
            }
            while(rope<nums2.length){
                if (nums2[rope] >tape){
                    arr.add(nums2[rope]);
                    sak++;
                    
                   // break;
                }
                
                rope++;
            }
            if (rope==nums2.length+1){
                arr.add(-1);
                sak++;
            }
            
            
        }
        Integer[] arras= new Integer[arr.size()];
        arras = arr.toArray(arras);
  //      int[] asar = arr.toArray(new int[arr.size()]);
        return arras;
        
    }
}