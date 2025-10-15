//Find the first non-repeating elment in given array of integers
//Find the first non-repeating element in a given array arr of N integers.
//Note: Array consists of only positive and negative integers and not zero.
//Example 1:
//Input : arr[] = {-1, 2, -1, 3, 2}
//Output : 3

class Main {
    
        public static void main(String[] args) {
            int[] arr = { -1, 2, -1, 3, 2 };
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                boolean isRepeating = false;

                // Check if arr[i] repeats
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        isRepeating = true;
                        break;
                    }
                }

                if (!isRepeating) {
                    System.out.println("First non-repeating element: " + arr[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No non-repeating element found.");
            }
        }
    

}
