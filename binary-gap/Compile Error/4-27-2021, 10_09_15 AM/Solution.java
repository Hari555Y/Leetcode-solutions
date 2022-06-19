// https://leetcode.com/problems/binary-gap

class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        ArrayList<Integer>  arr= new ArrayList<>(); 
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i)=='1'){
                arr.add(i);   
            }  
            
        }
        int max =0;
        if(arr.isEmpty() || arr.size()==1){
            return 0;
        }
        else{
            for (int k =0; k<arr.size()-1;k++){
                max = Math.max(max, arr.get(k+1)-arr.get(k));
                
            }
            
            
        }
    return max;
        
    }
