class Solution {
    public int search(int[] num, int t) {
      int mid;
      int l = 0;
      int r = num.length - 1;

      while(l <= r)
      {
        mid = l + (r-l)/2;

        if(t == num[mid])
        { 
            return mid;

        }
        if(t < num[mid])
        {
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
      }
      return -1;  
    }
}