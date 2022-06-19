// https://leetcode.com/problems/design-an-ordered-stream

import java.util.LinkedList;
import java.util.List;

class OrderedStream {
    String[] tracker;
    int pointer = 0;

    public OrderedStream(int n) {
        tracker = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        tracker[idKey - 1] = value;
       // int pointer = idKey-1;
        while (pointer < tracker.length && tracker[pointer] != null) {
            list.add(tracker[pointer]);
            pointer++;
        }
        return list;
    }
}