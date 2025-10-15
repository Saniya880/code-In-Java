//Find the first repeating element in array of integers

class Main{
        public static void main(String[] args) {
            int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("First repeating element: " + arr[i]);
                        found = true;
                        break; // stop inner loop
                    }
                }
                if (found)
                    break; // stop outer loop
            }

            if (!found) {
                System.out.println("No repeating elements found.");
            }
        }
    

}
