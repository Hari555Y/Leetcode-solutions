// https://leetcode.com/problems/first-bad-version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for (int i=0;i<n;i++){
            if (isBadVersion(i+1)){
                return i+1;
            }
        }
        return n+1;
        
    }
}