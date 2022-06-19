// https://leetcode.com/problems/count-square-sum-triples

class Solution {
    public int countTriples(int n) {
        HashSet<Integer> hash = new HashSet<>();
        int count=0;
        for (int i =1; i <=n; i++){
            for (int j =1; j<=n; j++){
                for (int k =1; k<=n ; k++){
                    if(k*k == i *i + j*j){
                        count++;
                    }
                    
                }
            }
        }
        return count;
    }
}