// https://leetcode.com/problems/finding-3-digit-even-numbers

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i =0 ; i<digits.length; i++){
            for(int j =0; j<digits.length; j++){
                for(int k = 0; k<digits.length; k++){
                    if(i!=j && j!=k && i!=k && digits[k]%2==0 && digits[i]!=0){
                        hash.add(100*digits[i] + 10*digits[j] + digits[k]);
                    }
                }
            }
        }
        int x =0;
        int[] ans  = new int[hash.size()];
         for(int p : hash){
             ans[x++] = p;
         }  
        Arrays.sort(ans);
        return ans;
    }
}