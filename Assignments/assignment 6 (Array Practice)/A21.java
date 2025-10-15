/**
 * .21 Max Sum in configuration
 * 
 * Given an array(0-based indexing), you have to find the max sum of i*A[i]
 * where A[i] is the element at index i in the array.The only operation allowed
 * is to rotate(clock-wise or counter clock-wise) the array any number of times.
 * Example 1:
 * Input:
 * N = 4
 * A[] = {8,3,1,2}
 * Output: 29
 */
class Main {
    public static int maxSumConfig(int[] arr) {
        int n = arr.length;
        int totalSum = 0; // Sum of all elements
        int currVal = 0; // Current sum of i * A[i]

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        // Calculate sum for other rotations
        for (int i = 1; i < n; i++) {
            currVal = currVal + totalSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 2 };
        System.out.println(maxSumConfig(arr)); // Output: 29
    }
}
