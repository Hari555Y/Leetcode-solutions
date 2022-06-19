// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits

class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> a = new ArrayList<>();
        while(num !=0){
            int p = num%10;
            a.add(p);
            num = num/10;
        }
        Collections.sort(a);
        return a.get(0)*10 + a.get(1)*10 + a.get(2) + a.get(3);
    }
}