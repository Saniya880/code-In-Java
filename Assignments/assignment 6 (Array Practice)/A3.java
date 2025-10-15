//Write a program to reverse the array.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int i,j,temp=0;

    System.out.println("Enter size of array");
    int n=sc.nextInt();

    int a[]= new int[n];
    for(i=0; i<n; i++){
    System.out.println("Enter "+(i+1)+" elements in array");
    a[i]= sc.nextInt();}

    System.out.println("Array in reverse order- ");
         i=0;
        j=n-1;
        while(i<=j){
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
      }
      for( i=0; i<n; i++)
      System.out.print(" "+a[i]);
    }}