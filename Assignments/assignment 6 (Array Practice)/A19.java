/* Q.19) Find Maximum product contigeous sub array 

Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
*/
class Main {
    public static int maxSubArrayProduct(int[] arr) {
        int maxProduct = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (current < 0) {
                // Swap max and min when multiplied by negative
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(current, maxEndingHere * current);
            minEndingHere = Math.min(current, minEndingHere * current);

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = { 6, -3, -10, 0, 2 };
        int result = maxSubArrayProduct(arr);
        System.out.println(result); // Output: 180
    }
}
