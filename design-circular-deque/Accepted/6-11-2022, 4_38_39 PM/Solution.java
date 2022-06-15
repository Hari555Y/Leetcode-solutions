// https://leetcode.com/problems/design-circular-deque

class MyCircularDeque {
    
    node head;
    node tail;
    int siz;
    int cap;
    public MyCircularDeque(int k) {
        head = new node(-1);
        tail = new node(-1);
        cap = k;
        siz =0;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        head.prev = null;
        
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        node added = new node(value);
        node roop = head.next;
        head.next = added;
        added.next = roop;
        roop.prev = added;
        added.prev = head;
        siz++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        node added = new node(value);
        node roop = tail.prev;
        tail.prev = added;
        added.prev = roop;
        roop.next = added;
        added.next = tail;
        siz++;
        return true;
        
       // siz++;
      //  return true;
        
    }
    
    public boolean deleteFront() {
        if (isEmpty()){
            return false;
        }
    //    node topo = head;
        head.next = head.next.next;
        head.next.prev = head;
        siz--;
        return true;
        
    }
    
    public boolean deleteLast() {
        if (isEmpty()){
            return false;
        }
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;      
        siz--;
        return true;
        
        
        
    }
    
    public int getFront() {
        if (isEmpty()){
            return -1;
        }
        return head.next.val;
        
    }
    
    public int getRear() {
        if (isEmpty()){
            return -1;
        }
        return tail.prev.val;
    }
    
    public boolean isEmpty() {
        if (siz==0){
            return true;
        }
        return false;
        
    }
    
    public boolean isFull() {
        return cap==siz;
        
    }
}
class node{
    int val;
    node prev;
    node next;
    public node(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */