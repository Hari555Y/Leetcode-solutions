// https://leetcode.com/problems/add-to-array-form-of-integer

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(k!=0){
            arr.add(k%10);
            k = k/10;
        }
        List<Integer> ans = new ArrayList<Integer>();
        int i =0; 
        int j = num.length-1;
        int carry =0;
        while(j>=0 || i < arr.size()){
            int nu =carry;
            if (j>=0){
                nu+=num[j];
            }
            if (i<arr.size()){
                nu+=arr.get(i);
            }
            ans.add((nu)%10);
            carry = (nu)/10;
            j--; i++;  
        }
        if (carry>0){
            ans.add(carry);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}