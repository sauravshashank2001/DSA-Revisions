/*** 
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 * 
*/

/**Brute force 
 * 
 * Try every possible pair of lines (i, j) where i < j

The width of the container = j - i

The height of the container = min(height[i], height[j])

Water stored = width × height

Track the maximum water found
 * 
 * 
*/

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int containerHeight = Math.min(height[i], height[j]);
                int water = width * containerHeight;
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }
}


/** Two pointer approach 
 * Area = min(height[left], height[right]) × (right - left)

The width always decreases as pointers move inward

To possibly get a larger area, we must try to increase the height

So, move the pointer with the smaller height
 * 
 * 
 * 
*/

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }

        return res;
    }
}


