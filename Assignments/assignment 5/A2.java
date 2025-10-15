 // WAP to program to calculate the sum of all element of array.
import java.util.Scanner;
class Array{
    public static void main (String[]args){
     Scanner sc= new Scanner(System.in);

    System.out.println("Enter data size-");
    int n = sc.nextInt();
    int sum=0;
    
    int arr[] = new int [n];

    for(int i=0; i<n; i++){
    System.out.println("Enter "+(i+1)+" element in array");
    arr[i]= sc.nextInt();
    sum=sum+arr[i];}

    System.out.print("Sum of all element of array is-  "+sum);
    }
}