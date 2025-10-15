// Write a Java program to swap first and last element of an integer 1-d array.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter size of array- ");
    int n= sc.nextInt();

     int a[]= new int[n];
     int i;
    for( i=0; i<n; i++){
    System.out.println("Enter "+(i+1)+ " element of array-");
    a[i] = sc.nextInt();
    }

        a[0]=a[0]+a[n-1];
        a[n-1]= a[0]-a[n-1];
        a[0] =  a[0]-a[n-1];
        System.out.print("\n Array after swapping 1st and last element- ");
        for(i=0; i<n; i++)
        System.out.print(" "+a[i]);
    }
}