// https://leetcode.com/problems/number-of-recent-calls

class RecentCounter {
    int counter;
    ArrayList<Integer> ans = new ArrayList<>();
    public RecentCounter() {
        counter =0;
        ans = new ArrayList<>();
        
    }
    
    public int ping(int t) {
        ans.add(t);
        int count =0;
        for(int i = ans.size()-1 ; i>=0; i--){
            if (t-ans.get(i)<=3000){
                count++;
            }
            
        }
        return count;
        
        
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */