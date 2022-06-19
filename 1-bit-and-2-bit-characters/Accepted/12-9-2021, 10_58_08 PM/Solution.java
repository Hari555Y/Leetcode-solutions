// https://leetcode.com/problems/1-bit-and-2-bit-characters

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int count =0;
        if (bits.length==1){
            return true;
        }
        int l = bits.length-2;
        while(l>=0){
            if (bits[l]==1){
                count++;
                l--;
            }
            else{
                break;
            }
        }
        return count%2==0;
        
    }
}