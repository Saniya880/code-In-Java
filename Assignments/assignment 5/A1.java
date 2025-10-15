// WAP to Enter n element in array and print array
import java.util.Scanner;
class Array{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);

    System.out.println("Enter data size-");
    int n = sc.nextInt();
    
    System.out.println("Enter elements in array-");
    int arr[] = new int [n];
    
    for(int i=0; i<n; i++)
    arr[i]= sc.nextInt();

    for(int i=0; i<n; i++)
    System.out.print(" "+arr[i]);
    }
}