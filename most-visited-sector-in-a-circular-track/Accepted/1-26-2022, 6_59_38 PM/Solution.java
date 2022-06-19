// https://leetcode.com/problems/most-visited-sector-in-a-circular-track

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] arr = new int[n+1];
        List<Integer> ans = new ArrayList<>();
        for(int i =1; i<rounds.length; i++){
            if (i==1){
                if (rounds[(i)]>rounds[(i-1)]){
                    for(int p =rounds[(i-1)]; p<=rounds[(i)]; p++){
                        arr[p]++;
                    }
                }
                else{
                    for(int m = rounds[(i-1)]; m <=n; m++){
                        arr[m]++;
                    }
                    for(int m = 1; m <=rounds[i]; m++){
                        arr[m]++;
                    }
                }
                
            }
            else{
            if (rounds[(i)]>rounds[(i-1)]){
                for(int p =rounds[(i-1)]+1; p<=rounds[(i)]; p++){
                    arr[p]++;
                }
            }
            else{
                for(int m = rounds[(i-1)]+1; m <=n; m++){
                    arr[m]++;
                }
                for(int m = 1; m <=rounds[i]; m++){
                    arr[m]++;
                }
            }}
        }
        for(int i :  arr){
            System.out.print(i + " ");
        }
        int max = -999;
        for(int i  :  arr){
            max = Math.max(max, i);
        }
        for(int i =1; i<=n; i++){
            if (arr[i] == max){
                ans.add(i);
            }
        }
        return ans;
        
    }
}