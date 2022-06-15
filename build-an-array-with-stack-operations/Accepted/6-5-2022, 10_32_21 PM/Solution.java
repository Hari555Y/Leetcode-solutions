// https://leetcode.com/problems/build-an-array-with-stack-operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ls = new ArrayList<>();
        int have_to_be = 1;
        for(int i =1; i<=target.length; i++){
            if (target[i-1]  != have_to_be){
                int c  = target[i-1] - have_to_be;
                while(c-->0){
                    ls.add("Push");
                    ls.add("Pop");
                    
                }
                
            }
            ls.add("Push");
            have_to_be = target[i-1] +1;
            
        }
        return ls;
        
    }
}