// https://leetcode.com/problems/design-circular-queue

class MyCircularQueue {
    int h;
    int t;
   // int k;
    int siz;
    int cap;
    int[] arr;

    public MyCircularQueue(int r) {
        h =-1; t =-1 ;
        arr = new int[r];
        siz= 0;
        cap = r;
    }
    
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        if(h==-1){
            h = 0;
        }
        arr[(t+1)%cap]= value;
        t = (t+1)%cap;
        siz++;
        System.out.println(arr[(t+1)%cap] + " " +    t);
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
       // arr[h] = -2;
        h = (h+1)%cap;
        siz--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[h%cap];
    }
    
    public int Rear() {
      if(isEmpty()){
            return -1;
        }
        return arr[t%cap];
        
    }
    
    public boolean isEmpty() {
        //return (h)%k==t%k;
        return siz==0;
        
    }
    
    public boolean isFull() {
        return siz == cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */