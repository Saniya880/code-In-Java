//Write a Java program to reverse the element of an integer 1-D array. 
import java.util.Scanner;
class Reverse{
    private static int n;
    private static int a[];

    public static void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array ");
    n = sc.nextInt();
    a= new int [n];

    System.out.println("Enter the elements in array ");
    for(int i=0; i<n; i++)
       a[i] = sc.nextInt();
    }
    public static void reverseArray(){
        int i=0, j=n-1, temp;
        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        } for(int element : a)
        System.out.print(" "+element);
    }
}
class Main{
    public static void main(String[]args){
     Reverse obj = new Reverse();
     obj.input();
     obj.reverseArray();
    }
}