public class unpaired_number {

    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == nums[mid ^ 1]) {

                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println("Test Case 1 Output: " + singleNonDuplicate(nums1));
        int[] nums2 = { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println("Test Case 2 Output: " + singleNonDuplicate(nums2));
    }
}
