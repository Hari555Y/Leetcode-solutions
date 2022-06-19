// https://leetcode.com/problems/add-digits

class Solution {
    public int addDigits(int num) {
        //int temp =num;
       // int sek =0;
        int rok=num;
        while(rok>=10){
          //  sek +=temp%10;
            //temp =temp/10;
            rok = givenumber(rok);   
        }
        return rok;
        
        
    }
    public int givenumber(int k){
        int temp =k;
        int seru =0;
        while(temp!=0){
            seru+=temp%10;
            temp = temp/10;
            
            
        }
        return seru;
    }
    
}