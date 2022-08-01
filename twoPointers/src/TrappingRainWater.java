public class TrappingRainWater {
    // Two Pointers
    //Problem: https://leetcode.com/problems/trapping-rain-water/
    //Solution: https://leetcode.com/submissions/detail/762030992/
    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (left < right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] >= maxLeft) {
                    maxLeft = heights[left];
                } else {
                    totalWater += maxLeft - heights[left];
                }
                left++;
            } else {
                if (heights[right] >= maxRight) {
                    maxRight = heights[right];
                } else {
                    totalWater += maxRight - heights[right];
                }

                right--;
            }
        }

        return totalWater;
    }
}
