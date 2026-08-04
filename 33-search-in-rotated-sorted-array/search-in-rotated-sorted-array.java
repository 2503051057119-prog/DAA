class Solution {
    public int search(int[] num, int t) {

        int l = 0;
        int r = num.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (num[mid] == t) {
                return mid;
            }

            
            if (num[l] <= num[mid]) {

                if (t >= num[l] && t < num[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }
           
            else {

                if (t > num[mid] && t <= num[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }

        return -1;
    }
}