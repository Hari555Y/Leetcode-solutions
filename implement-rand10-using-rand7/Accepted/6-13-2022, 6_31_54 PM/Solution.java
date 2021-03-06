// https://leetcode.com/problems/implement-rand10-using-rand7

/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int x = rand7() + rand7() + rand7() + rand7() + rand7()
            + rand7() + rand7() + rand7() + rand7() + rand7();
        return x%10 + 1;
        
        
    }
}