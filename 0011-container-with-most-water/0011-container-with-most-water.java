class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;

        int left = 0;
        int right = height.length-1;

        while(left < right){
            int curVol = (right-left)*Math.min(height[left],height[right]);
            maxVol = Math.max(maxVol,curVol);

            if(height[left] >= height[right]){
                right--;
            } else {
                left++;
            }
        }
        return maxVol;
    }
}