 /*.20 Longest consecutive sequence.
 Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
  
 Example 1:
 Input:
 N = 7
 a[] = {2,6,1,9,4,5,3}
 Output:
 6
 */
 import java.util.Arrays;

 class Main {
     public static int longestConsecutive(int[] arr) {
         if (arr.length == 0)
             return 0;

         Arrays.sort(arr);

         int longest = 1;
         int count = 1;

         for (int i = 1; i < arr.length; i++) {
             // Skip duplicate elements
             if (arr[i] == arr[i - 1]) {
                 continue;
             }

             // Check if current element is consecutive
             if (arr[i] == arr[i - 1] + 1) {
                 count++;
             } else {
                 // Reset count if not consecutive
                 longest = Math.max(longest, count);
                 count = 1;
             }
         }

         // Final check for last sequence
         return Math.max(longest, count);
     }

     public static void main(String[] args) {
         int[] arr = { 2, 6, 1, 9, 4, 5, 3 };
         System.out.println(longestConsecutive(arr)); // Output: 6
     }
 }
