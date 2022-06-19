// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity

class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> eve  = new ArrayList<>();
        ArrayList<Integer> od = new ArrayList<>();
        int r = num;
        while(num!=0){
            int p = num%10;
            if (p%2==0){
                eve.add(p);  
            }
            else
                od.add(p);
            num = num/10;
        }
        Collections.sort(eve, Collections.reverseOrder());
        Collections.sort(od, Collections.reverseOrder());
        String s = String.valueOf(r);
        int n = s.length();
        int e =0; int o =0;
        int nums =0;
        for(int i =0; i<n ; i++){
            int m = Character.getNumericValue(s.charAt(i));
            if (m%2==0){
                nums = 10* nums  + eve.get(e++);
            }
            else{
                nums = 10*nums + od.get(o++);
                
            }
        }
        return nums;
        
    }
}