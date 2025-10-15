/**
 * Q.17 Find it there is any subarray with sum equals to zero
 * Given an array of positive and negative numbers. Find if there is a subarray
 * (of size at-least one) with 0 sum.
 * Example 1:
 * Input:
 * 5
 * 4 2 -3 1 6
 * 
 * Output:
 * Yes
 */
class Main {
    public static boolean hasZeroSumSubarray(int[] arr) {
        int n = arr.length;

        // Try all subarrays starting from every index
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
