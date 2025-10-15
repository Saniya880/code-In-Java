// Q.12Find common elements in three sorted arrays.
//Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
//Note: can you take care of the duplicates without using any additional Data Structure?
//Example 1:
//Input:
//n1 = 6; A = {1, 5, 10, 20, 40, 80}
//n2 = 5; B = {6, 7, 20, 80, 100}
//n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
//Output: 20 80

 class Main {
    public static void main(String[] args) {
        // Input arrays
        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };

        System.out.print(" Common elements: ");
        findCommon(A, B, C);
    }

    public static void findCommon(int[] A, int[] B, int[] C) {
        int i = 0, j = 0, k = 0;
        int lastPrinted = Integer.MIN_VALUE; // To avoid duplicates

        while (i < A.length && j < B.length && k < C.length) {
            // If all three elements are equal
            if (A[i] == B[j] && B[j] == C[k]) {
                if (A[i] != lastPrinted) { // Avoid duplicate printing
                    System.out.print(A[i] + " ");
                    lastPrinted = A[i];
                }
                i++;
                j++;
                k++;
            }
            // Move pointer with the smallest value
            else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
