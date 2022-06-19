// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ar = new int[2];
        int a = first(nums, target, nums.length);
        int b = last(nums, target ,nums.length);
        ar[0] = a;
        ar[1] = b;    
        return ar;
        
    }
static int first(int arr[],
                 int x, int n)
{
  int low = 0, high = n - 1,
      res = -1;
  while (low <= high)
  {
    // Normal Binary Search Logic
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
 
    // If arr[mid] is same as
    // x, we update res and
    // move to the left half.
    else
    {
      res = mid;
      high = mid - 1;
    }
  }
  return res;
}
 
// If x is present in arr[] then returns
// the index of LAST occurrence of x in
// arr[0..n-1], otherwise returns -1
static int last(int arr[], int x, int n)
{
  int low = 0, high = n - 1,
      res = -1;
  while (low <= high)
  {
    // Normal Binary Search Logic
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
 
    // If arr[mid] is same as x,
    // we update res and move to
    // the right half.
    else
    {
      res = mid;
      low = mid + 1;
    }
  }
  return res;
}
 
}