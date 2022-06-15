// https://leetcode.com/problems/positions-of-large-groups

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new LinkedList<>();
        int st = 0;
        int i =0;
        while(st<s.length()-1){
            if(s.charAt(st+1) == s.charAt(st)){
                st++;
            }
            else{
                System.out.println(st);
                System.out.println(i);
                if (st-i >=2){
          List<Integer> ls = new LinkedList<>();
                    ls.add(i);
                    ls.add(st);
                    ans.add(ls);
                //    ls.clear();
                }
                st++;
                i = st;
               // st++;
            }
        }
        if (st==s.length()-1 && i!=st){
            if (st-i>=2){
              List<Integer> ls = new LinkedList<>();
                    ls.add(i);
                    ls.add(st);
                    ans.add(ls);   
            }
        }
        return ans;
        
    }
}