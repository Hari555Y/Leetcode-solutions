// https://leetcode.com/problems/my-calendar-ii

class MyCalendarTwo {
    List<int[]> cal;
    List<int[]> twocal;

    public MyCalendarTwo() {
        cal = new ArrayList<>();
        twocal = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] x: twocal){
            if(x[0]<end && x[1]>start){
                return false;
            }
        }
        for (int[] m : cal){
            if(m[0]<end && m[1]>start){
                twocal.add(new int[]{Math.max(start,m[0]),Math.min(end, m[1])});
            }
        }
        cal.add(new int[]{start,end});
        return true;
        
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */