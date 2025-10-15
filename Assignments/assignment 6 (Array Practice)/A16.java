 //Rearrange the array in alternating positive and negative items
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with positive number.

   
 import java.util.*;

  class Main {
     public static void rearrange(int[] arr) {
         int n = arr.length;

         // Step 1: Count positives and negatives
         int posCount = 0, negCount = 0;
         for (int num : arr) {
             if (num >= 0)
                 posCount++;
             else
                 negCount++;
         }

         // Step 2: Create arrays for positives and negatives
         int[] positives = new int[posCount];
         int[] negatives = new int[negCount];

         int p = 0, q = 0;
         for (int num : arr) {
             if (num >= 0)
                 positives[p++] = num;
             else
                 negatives[q++] = num;
         }

         // Step 3: Merge back alternately (start with positive)
         int i = 0, pi = 0, ni = 0;
         while (pi < posCount && ni < negCount) {
             arr[i++] = positives[pi++];
             arr[i++] = negatives[ni++];
         }

         // Step 4: Copy remaining
         while (pi < posCount) {
             arr[i++] = positives[pi++];
         }
         while (ni < negCount) {
             arr[i++] = negatives[ni++];
         }
     }

     public static void main(String[] args) {
         int[] arr = { 3, -2, -1, 4, -5, 6, -7, 8, 9 };

         System.out.println("Original: " + Arrays.toString(arr));
         rearrange(arr);
         System.out.println("Rearranged: " + Arrays.toString(arr));
     }
 }
