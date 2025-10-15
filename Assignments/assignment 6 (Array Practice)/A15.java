//Sub with equal 0s and 1s
//Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
//Example 1:
//Input:
//n = 7
//A[] = {1,0,0,1,0,1,1}
//Output: 8

class Main{
   public static void main(String[] args) {
      
            int[] arr = { 1, 0, 0, 1, 0, 1, 1 };
            int n = arr.length;

            // Step 1: Replace 0 with -1
            for (int i = 0; i < n; i++) {
               if (arr[i] == 0)
                  arr[i] = -1;
            }

            // Step 2: Frequency array to store prefix sum counts
            int[] freq = new int[2 * n + 1]; // index shift by +n
            int sum = 0, count = 0;

            // Initial sum 0 occurs once
            freq[n] = 1;

            // Step 3: Traverse array
            for (int num : arr) {
               sum += num;

               int index = sum + n; // shift to avoid negative index
               if (freq[index] > 0) {
                  count += freq[index]; // add number of times sum seen before
               }
               freq[index]++;
            }

            System.out.println("Number of subarrays with equal 0s and 1s: " + count);
         

   } 
}
