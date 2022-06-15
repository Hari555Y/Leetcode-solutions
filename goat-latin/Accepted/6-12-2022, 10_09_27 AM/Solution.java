// https://leetcode.com/problems/goat-latin

class Solution {
    public String toGoatLatin(String s) {
        String[] arr = s.split(" ");
        String adder = "a";
        for(int i =0 ; i<arr.length; i++){
            if(arr[i].charAt(0) == 'a' ||
              arr[i].charAt(0) == 'e' ||
              arr[i].charAt(0) == 'i' ||
              arr[i].charAt(0) == 'o' ||
              arr[i].charAt(0) == 'u' ||
              arr[i].charAt(0) == 'A' ||
              arr[i].charAt(0) == 'E' ||
              arr[i].charAt(0) == 'I' ||
              arr[i].charAt(0) == 'O' ||
              arr[i].charAt(0) == 'U' ){
               // arr[i]= arr[i].substring(1, arr[i].length()) + arr[i].charAt(0);
                arr[i] += "ma";
                arr[i] += adder;               
            }
            else{
                                arr[i]= arr[i].substring(1, arr[i].length()) + arr[i].charAt(0);
                arr[i] += "ma";
                arr[i] += adder; 
            }
            adder +='a';
        }
        return String.join( " " ,arr);
        
    }
}