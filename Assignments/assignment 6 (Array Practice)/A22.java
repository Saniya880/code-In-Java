/* Java program to find nearest lesser and greater element in array
Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
Example:
    Input:
    Enter the number of elements for the arrray : 3  
 
    Enter the elements for array_1.. 
    array_1[0] : 1   
    array_1[1] : 2   
    array_1[2] : 3   
 
    Enter the number : 2 
 
    Output:
    Element lesser than 2 is : 1 
    Element greater than 2 is : 3
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements for the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements for array:");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        Integer lesser = null;
        Integer greater = null;

        for (int val : arr) {
            if (val < num) {
                // Update lesser if it's closer (larger but still less than num)
                if (lesser == null || val > lesser) {
                    lesser = val;
                }
            } else if (val > num) {
                // Update greater if it's closer (smaller but still greater than num)
                if (greater == null || val < greater) {
                    greater = val;
                }
            }
        }

        if (lesser != null) {
            System.out.println("Element lesser than " + num + " is : " + lesser);
        } else {
            System.out.println("No lesser element found");
        }

        if (greater != null) {
            System.out.println("Element greater than " + num + " is : " + greater);
        } else {
            System.out.println("No greater element found");
        }

        sc.close();
    }
}
