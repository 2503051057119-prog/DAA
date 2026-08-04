class Solution {
    public int findPeakElement(int[] num) {

        int l = 0;
        int r = num.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (num[mid] < num[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}