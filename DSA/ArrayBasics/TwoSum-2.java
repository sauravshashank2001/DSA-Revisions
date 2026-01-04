/**
 * Given a 1-indexed array of integers numbers 
 * that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, 
index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * 
 * Input: numbers = [2,7,11,15], target = 9
Output: [0,1]
 */

/**Brute Force 1 - Try all pairs (i, j) where i < j two for loop  - tc - o(n^2) */

/**Optimized  - use hashmap to store elements and their indices and iterate to find target-current in hashmap s.c - o(n) */

/**Optimal  - use two pointers approach since array is sorted */

public int[] twoSum(int[] numbers, int target) {
        int start=0,end = numbers.length-1;

        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start,end};
            }
            else if(sum> target){
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1,-1};

    }