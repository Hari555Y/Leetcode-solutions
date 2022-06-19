// https://leetcode.com/problems/check-array-formation-through-concatenation

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,Integer> has = new HashMap<>();
        for (int i=0; i<arr.length;i++){
            has.put(arr[i], i);
        }
        for (int i =0; i<pieces.length; i++){
            if (pieces[i].length==1){
                if (has.containsKey(pieces[i])){
                    has.remove(pieces[i]);
                }
                else{
                    return false;
                }
            }
            else{
                int tel = pieces[i].length;
                for (int j =0; j<tel-1;j++){
                    if (!has.containsKey(pieces[i][j]) || !has.containsKey(pieces[i][j+1])){
                        return false;
                    }
                    else if (has.getValue(pieces[i][j]) +1 != has.getValue(pieces[i][j+1]) ){
                        return false;
                    }
                    else{
                        remove(pieces[i][j]);
                    }
                }
            }
        }
        if (has.isEmpty()){
            return true;
        }
        else{
            return false;
                            
         }
        
    }
}