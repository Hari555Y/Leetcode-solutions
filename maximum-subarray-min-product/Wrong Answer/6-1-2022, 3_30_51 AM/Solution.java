// https://leetcode.com/problems/maximum-subarray-min-product

class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> prev = prev_smaller(nums);
        Collections.reverse(Arrays.asList(nums));
        ArrayList<Integer> nxt = prev_smaller(nums);
        // for(int i : nxt){
        //     System.out.print(i + " ");
        // }
        for(int i =0; i<nxt.size(); i++){
            int r = nxt.get(i);
            nxt.set(i, n-1-r);
        }
        Collections.reverse(Arrays.asList(nums));
        Collections.reverse(nxt);
        for(int i : prev){
            System.out.println(i + " ");
        }
        for(int i : nxt){
            System.out.println(i + " ");
        }
        long ans = 0;
        ArrayList<Long> pref_sum = new ArrayList<>();
        pref_sum.add((long)nums[0]);
        for(int i =1; i<n; i++){
            pref_sum.add(pref_sum.get(i-1) + (long)nums[i]);
        }
        for(int i =0; i<n ; i++){
            long sum = pref_sum.get(nxt.get(i)-1) - (prev.get(i) == -1 ? 0 : pref_sum.get(prev.get(i)));
            ans = Math.max(ans, (long)nums[i]*(sum));
        }
        return (int)ans%1000000007;
        
        
        
    }
    public static ArrayList<Integer> prev_smaller(int[] a){
        int n = a.length;
        ArrayList<Integer> prev = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i =0; i<n; i++){
            while (st.peek()!= -1 && a[st.peek()] >= a[i]){
                st.pop();
            }
            prev.add(st.peek());
            st.push(i);
        }
        return prev;
        
    }
}