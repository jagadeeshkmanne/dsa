public class ContainerWithMostWater {
    // Two Pointers
    //Problem: https://leetcode.com/problems/container-with-most-water/
    //Solution: https://leetcode.com/submissions/detail/761901275/
    public int maxArea(int[] heights) {
        //two pointers
        int p1 = 0;
        int p2 = heights.length-1;
        int maxArea = 0;
        while (p1 < p2) {
            int width = p2 - p1;
            int height = Math.min(heights[p1], heights[p2]);
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if (heights[p1] <= heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxArea;
    }
}
