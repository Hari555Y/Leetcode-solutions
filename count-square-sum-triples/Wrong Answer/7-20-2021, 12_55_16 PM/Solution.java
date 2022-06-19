// https://leetcode.com/problems/count-square-sum-triples

class Solution {
    public int countTriples(int n) {
        if(n<=4){
            return 0;
        }
        HashSet<Integer> hash = new HashSet<>();
        for (int i =1; i < n; i++){
            for (int j =i; j<=n; j++){
                hash.add(i*i + j *j);
            }
        }
        int count =0;
        for (int i =1; i<=n; i++){
            if (hash.contains(i*i)){
                count++;
            }
        }
        return 2 * count;
    }
}