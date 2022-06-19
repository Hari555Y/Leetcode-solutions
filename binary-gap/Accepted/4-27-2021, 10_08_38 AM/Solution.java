// https://leetcode.com/problems/binary-gap

class Solution {
    public int binaryGap(int n) {
        String s = todec(n);   // int max =0;
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
    public static String  todec(int num)
    {
        StringBuilder sb = new StringBuilder();
       //tringBuilder d assigning binary array size
       //nt[] binary = new int[35];
        //t id = 0;
  
        // Number should be positive
        while (num > 0) {
            sb.insert(0, num%2);
           //inary[id++] = num % 2;
            num = num / 2;
        }
        return sb.toString();
  
        // Print Binary
       //rintBinary(binary, id);
    }
}