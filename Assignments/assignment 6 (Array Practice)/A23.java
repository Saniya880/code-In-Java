//Write a Java program to find the sum and average of one dimensional integer array. 
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter data size");
    int n=sc.nextInt();
    int a[]=new int [n];
    int sum=0;

    
    for(int i=0; i<n; i++){
    System.out.println("Enter "+(i+1)+"  element");
    a[i]=sc.nextInt();
    sum=sum+a[i];}
    float average=sum/n;


    System.out.println("Sum of 1D Array is - "+sum);
    System.out.println("Average -  "+average);

    }
}