// https://leetcode.com/problems/find-median-from-data-stream

class MedianFinder {
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;
    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        large = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        if (small.size() ==0  || small.peek() >=num){
            small.add(num);    
        }
        else{
            large.add(num);
        }
        if(small.size()>large.size()+1){
            int x = small.poll();
            large.add(x);
        }
        if(small.size()+1<large.size()){
            int x = large.poll();
            small.add(x);
        }
    }
    
    public double findMedian() {
        if(small.size()==large.size()){
            return (double)(small.peek() + large.peek())/2.0;
        }
        else if(small.size()>large.size()){
            return (double)small.peek();
        }
        else{
            return (double)large.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */