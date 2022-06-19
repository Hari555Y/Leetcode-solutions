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
        
      //  String[] arrs = arr.stream().mapToString(i -> i).toArray();
        String[] myarr = arr.toArray(new String[arr.size()]);
        
        return myarr;
        
        
    }
    public boolean ispresent(String st){
        String first = "QWERTYUIOPqwertyuiop";
        String second ="ASDFGHJKLasdfghjkl";
        String third =    "ZXCVBNMzxcvbnm";
       // int count =0;
        if (first.contains(Character.toString(st.charAt(0)))){
            
            for(int i =1;i<st.length();i++){
                
                if (!first.contains(Character.toString(st.charAt(i)))){
                    
                    return false;
                    
                }
            }
                    
                    
        } 
        if (second.contains(Character.toString(st.charAt(0)))){
            
            for(int i =1;i<st.length();i++){
                
                if (!second.contains(Character.toString(st.charAt(i)))){
                    
                    return false;
                    
                }
            }
                    
                    
        }
        if (third.contains(Character.toString(st.charAt(0)))){
            
            for(int i =1;i<st.length();i++){
                
                if (!third.contains(Character.toString(st.charAt(i)))){
                    
                    return false;
                    
                }
            }
                    
                    
        }
        return true;
    }
}
            
            
                        