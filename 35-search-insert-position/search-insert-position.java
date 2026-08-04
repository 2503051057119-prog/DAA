class Solution {
    public int searchInsert(int[] num, int t) {
        int mid;
        int l = 0;
        int r = num.length - 1;

        while(l <= r)
        {
            mid = l + (r - l)/2;

            if(num[mid] ==t){
                return mid;
            }
            if(t <= num[mid])
            {
                r = mid - 1;
            }
            if(t >= num[mid])
            {
                l = mid + 1;
            }
        }
        return l;
    }
}