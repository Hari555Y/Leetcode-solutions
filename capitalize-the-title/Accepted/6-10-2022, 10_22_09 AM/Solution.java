// https://leetcode.com/problems/capitalize-the-title

class Solution {
    public String capitalizeTitle(String title) {
        int n = title.length();
        String[] arr = title.split(" ");
        for(int i =0 ;i <arr.length; i++){
            arr[i] = (arr[i].length()>2) ? Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1 ,arr[i].length()).toLowerCase() : arr[i].toLowerCase();
            
            
        }
        return String.join(" " ,arr);
    }
}