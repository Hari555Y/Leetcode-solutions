// https://leetcode.com/problems/keyboard-row

class Solution {
    public String[] findWords(String[] words) {
        int count =0;
        for (int i =0; i< words.length;i++){
            String mk = words[i].toLowerCase();
            if (ispresent(mk)){
                count++;
            }
            
        }
        return count;
        
        
    }
    public boolean ispresent(String st){
        String first = "qwertyuiop";
        String second ="asdfghjkl";
        String third =    "zxcvbnm";
       // int count =0;
        if (first.contains(st.charAt(0))){
            
            for(int i =1;i<st.length();i++){
                
                if (!first.contains(st.charAt(i))){
                    
                    return false;
                    
                }
                    
                    
        } 
        if (second.contains(st.charAt(0))){
            
            for(int i =1;i<st.length();i++){
                
                if (!second.contains(st.charAt(i))){
                    
                    return false;
                    
                }
                    
                    
        }
        if (third.contains(st.charAt(0))){
            
            for(int i =1;i<st.length();i++){
                
                if (!third.contains(st.charAt(i))){
                    
                    return false;
                    
                }
                    
                    
        }
    return true;
    }
}