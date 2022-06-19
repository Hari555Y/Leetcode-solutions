// https://leetcode.com/problems/boats-to-save-people

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int len = people.length;
        int count =0;
        int mota = len-1;
        int patla =0;
        while (patla<=mota){
            if (people[mota]+people[patla]<=limit){
                count= count+1;
                patla = patla+1;
                mota = mota-1;
            }
            else{
                count = count+1;
                mota = mota-1;
            }
      //      mota = mota-1;
        //    patla = patla+1;
        }
        return count;
        
    }
}