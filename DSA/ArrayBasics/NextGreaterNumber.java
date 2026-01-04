

/**
 * Key- Digit to String  - String.valueOf(n).toCharArray(); (123 - "123")
 * iteration over each element and comparison become easy
 * '1'<'2' (java store string 1 as a numeric Unicode (ASCII-compatible) value.
    '0'	48
    '1'	49)

    eg. i/p - 12 ->21  123->132 , 321 -> -1, 1228321 -> 1231228
 
 * Approach: 
    1. Find pivot - rightmost index where digits[i]<digits[i+1]
    2. If no pivot, return -1 (highest permutation) 
    3. Find rightmost successor - smallest digit > digits[pivot] to the right
    4. Swap pivot and successor
    5. Reverse suffix (digits after pivot) to get smallest arrangement
    6. Parse to long, check for 32-bit overflow, return result or -1
    7. Return result if it's greater than n, otherwise return -1 


 * 
 */


class Solution {
    public int nextGreaterElement(int n) {
        // Negative numbers are out of scope for this problem
        if (n < 0) return -1;

        char[] digits = String.valueOf(n).toCharArray();

        // 1) Find pivot: the first index from right where digits[i] < digits[i + 1]
        int pivot = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivot = i;
                break;
            }
        }

        // No pivot -> current arrangement is the highest permutation
        if (pivot == -1) return -1;

        // 2) Find rightmost successor: smallest digit > digits[pivot] to the right
        int successor = -1;
        for (int j = digits.length - 1; j > pivot; j--) {
            if (digits[j] > digits[pivot]) {
                successor = j;
                break; // rightmost greater ensures minimal increment after reversal
            }
        }

        // Swap pivot and successor
        swap(digits, pivot, successor);

        // 3) Reverse the suffix to get the smallest possible number after pivot
        reverse(digits, pivot + 1, digits.length - 1);

        // 4) Parse safely with long, check 32-bit overflow as per problem requirement
        long candidate = Long.parseLong(new String(digits));
        if (candidate > Integer.MAX_VALUE) return -1;

        int result = (int) candidate;
        // The next permutation is guaranteed to be > n, but keep a defensive check
        return result > n ? result : -1;
    }

    private void reverse(char[] a, int l, int r) {
        while (l < r) {
            char t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }

    private void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}




