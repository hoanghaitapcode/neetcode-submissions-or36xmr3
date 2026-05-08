class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right) {
            int distance = right -left;
            int currentHeight = Math.min(heights[left],heights[right]);
            int currentWater = currentHeight*distance;
            if(currentWater > maxWater) {
                maxWater = currentWater;
            }
            if(heights[left]<heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
