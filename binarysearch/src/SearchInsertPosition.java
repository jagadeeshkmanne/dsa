public class SearchInsertPosition {

    //Problem: https://leetcode.com/problems/search-insert-position/
    //Solution: https://leetcode.com/submissions/detail/747713559/
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (target > nums[end]) {
            return end + 1;
        }

        if (target < nums[start]) {
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end + 1;
    }
}
