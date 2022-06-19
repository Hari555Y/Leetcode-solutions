// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<Integer>();
        Queue<Integer> sand= new LinkedList<>();
        int n= students.length;
        for(int i =0; i<n; i++){
            stu.add(students[i]);
            sand.add(sandwiches[i]);
        }
        int bool =0;
        while(!stu.isEmpty()){
            if (stu.peek()== sand.peek()){
                stu.poll();
                sand.poll();
                bool =0;
                
            }
            else{
                stu.add(stu.poll());
                bool++;
            }
            if (bool == stu.size()){
                return stu.size();            
            }
        }
        return 0;
        
        
    }
}