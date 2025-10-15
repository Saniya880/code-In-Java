//Write a program to sort the array
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size of array");
    int  n=sc.nextInt();
    int a[]= new int[n];
    int i,j, temp=0;

    System.out.println("Enter the elements in array- ");
    for(i=0; i<n; i++)
    a[i]= sc.nextInt();

    System.out.println(" After sorting-");
    for(i=0; i<n; i++){
    for(j=i+1; j<n; j++){
        if(a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }}
    for(i=0; i<n; i++)
    System.out.print(" "+a[i]);
    }
}