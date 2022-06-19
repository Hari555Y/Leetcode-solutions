// https://leetcode.com/problems/next-greater-element-i

class Solution {
public int[] nextGreaterElement(int[] a, int[] b) {
HashMap<Integer,Integer> map= new HashMap<>();
for(int i=0;i<b.length;i++){

        map.put(b[i],i); 
     
    }
    int [] out= new int[a.length];
    int k=0;
    for(int i:a){
        int flag=0;
        int val=map.get(i);
        for(int j=val;j<b.length;j++){
            if(b[j]>i){
                out[k]=b[j];
                flag=1;
                break;
            }
        }
        if(flag==0){
            out[k]=-1;
        }
        k++;
    }
    return out;
}
}