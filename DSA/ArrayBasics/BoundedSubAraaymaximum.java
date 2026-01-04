/*



Given an integer array nums and two integers left and right, return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right].

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,1,4,3], left = 2, right = 3
Output: 3
Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].


*/


/******solution 1 
 * Generate all subarray 
 * check max bound for each one and maintain the count 
 * 
 * 
*/

 public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int max = Integer.MIN_VALUE;

                // find max in nums[i..j]
                for (int k = i; k <= j; k++) {
                    max = Math.max(max, nums[k]);
                }

                if (max >= left && max <= right) {
                    count++;
                }
            }
        }
        return count;
        
    }





 