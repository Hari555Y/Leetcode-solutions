// https://leetcode.com/problems/min-stack

class MinStack {
    Stack<Integer> s; 
    Stack<Integer> mi;

    public MinStack() {
        s = new Stack<>();
         mi = new Stack<>();
        
    }
    
    public void push(int val) {
        s.push(val);
        if(mi.isEmpty()){
            mi.push(val);
        }
        else if (val < mi.peek()){
            mi.push(val);
            
        }
        else{
            mi.push(mi.peek());
        }
        
    }
    
    public void pop() {
        s.pop();
        mi.pop();
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return mi.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */