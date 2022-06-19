// https://leetcode.com/problems/next-permutation

class Solution {
    public void nextPermutation(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : nums)
            ans.add(i);
        ArrayList<Integer> news = nextP(ans);
        for(int i = 0 ; i<nums.length; i++){
            nums[i] = news.get(i);
        }
        return;
        
    }
        public ArrayList<Integer> nextP(ArrayList<Integer> A) {
        int l = A.size()-1;
        int turn =-1;
        while(l>=1){
            if (A.get(l-1)<A.get(l)){
                turn = l-1;
                break;
            }
            l--;
        }
        if(turn ==-1){
            Collections.reverse(A);
            return A;
        }
        int last = A.size()-1;
        while(last>turn){
            if(A.get(last)>A.get(turn)){
                int temp = A.get(last); int tempo = A.get(turn);
                A.set(turn, temp);
                A.set(last, tempo);
                break;
            }
            last--;
        }
        ArrayList<Integer> myans = new ArrayList<Integer>();
        List<Integer> ne = A.subList(turn+1, A.size());
        Collections.sort(ne);
        myans.addAll(A.subList(0, turn+1));
        myans.addAll(ne);
        return myans;
    }
}