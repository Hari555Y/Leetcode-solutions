// https://leetcode.com/problems/count-vowel-substrings-of-a-string

class Solution {
    public int countVowelSubstrings(String word) {
        int count =0;
        for(int i =0; i<word.length(); i++){
            int[] arr = new int[26];
            for(int j =i; j<word.length(); j++){
                if(word.charAt(j)=='a'  ||
                  word.charAt(j)=='e'  ||
                  word.charAt(j)=='i'  ||
                   word.charAt(j)=='o'  ||
                   word.charAt(j)=='u'
                  ){
                    arr[word.charAt(j)-'a']++;
                    if (arr[0]>0 && arr[4]>0 && arr[8]>0 && arr[14]>0 && arr[20]>0)
                        count++;
                    
                    //count++;
                }
                else{
                    break;
                }
                
            }
            
        }
        return count;
    }
}