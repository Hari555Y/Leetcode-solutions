// https://leetcode.com/problems/calculate-digit-sum-of-a-string

class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        String new_str = "";
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i<s.length();i++){
                st.push(Character.getNumericValue(s.charAt(i)));
                System.out.println(st.peek());
            if(st.size()==k || i==s.length()-1){
                int count =0;
                while(st.size()>0){
                    count +=st.pop();
                }
               // System.out.println(count);
                new_str += String.valueOf(count);
                
            }
          //  else
          //  }
            
        }
        return digitSum(new_str, k);
        
    }
}