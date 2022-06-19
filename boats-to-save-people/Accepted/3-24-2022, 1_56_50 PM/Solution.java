// https://leetcode.com/problems/boats-to-save-people

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i =0;
        int j = people.length-1;
        int cont =0;
        while(i<=j){
            if (i==j){
                cont++;
                i++;
                j--;
            }
            else if (people[i]+ people[j] <= limit){
                i++;
                j--;
                cont++;
            }
            else{
                cont++;
                j--;
            }
            
        }
        return cont;
        
    }
}