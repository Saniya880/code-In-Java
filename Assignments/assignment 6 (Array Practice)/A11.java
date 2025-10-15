//Count pair with given sum.Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Validate size
        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum K
        System.out.print("Enter the target sum (K): ");
        int k = sc.nextInt();

        int count = 0;

        // Check all pairs (i, j) such that i < j
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        // Output the result
        System.out.println("Number of pairs with sum " + k + ": " + count);

        sc.close();
    }
}

