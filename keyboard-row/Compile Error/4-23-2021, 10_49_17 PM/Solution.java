// https://leetcode.com/problems/keyboard-row

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i =0; i< words.length;i++){
           // String mk = words[i].toLowerCase();
            if (ispresent(words[i])){
                arr.add(words[i]);
            }
            
        }
        return arr;
        
        
    }
    public boolean ispresent(String st){
        String first = "QWERTYUIOPqwertyuiop";
        String second ="ASDFGHJKLasdfghjkl";
        String third =    "ZXCVBNMzxcvbnm";
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
        else{
            return true;
        }
    }
}