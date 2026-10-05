class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            // mid ^ 1 bitwise XOR:
            // if mid is even, mid ^ 1 gives mid + 1
            // if mid is odd, mid ^ 1 gives mid - 1
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}