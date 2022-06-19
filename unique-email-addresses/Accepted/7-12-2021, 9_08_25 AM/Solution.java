// https://leetcode.com/problems/unique-email-addresses

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String s : emails){
            String[] arr = s.split("@");
            String[] local = arr[0].split("\\+");
            String[] floc = local[0].split("\\.");
            String m = "";
            for (String dp : floc){
                m +=dp;
            }
            m +="@" + arr[1];
            set.add(m);
            
        }
        return set.size();
    }
}