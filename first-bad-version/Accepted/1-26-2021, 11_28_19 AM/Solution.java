// https://leetcode.com/problems/first-bad-version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first<last){
            int middle = first + (last-first)/2;
            if (isBadVersion(middle)){
                last = middle;
            }
            else{
                first = middle +1;
                
            }
        }
        return first;
        
    }
}