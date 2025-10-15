// WAP to program calaculate the sum of all even element and all odd element of array
import java.util.Scanner;
class Array{
    public static void main (String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter data size-");
    int n = sc.nextInt();

    int arr[] = new int [n];
    int even_sum=0, odd_sum=0;

    for(int i=0; i<n; i++){
    System.out.println("Enter"+(i+1)+"  element in Array-");
    arr[i]= sc.nextInt();
    if(arr[i]%2==0)
    even_sum += arr[i];
    else
    odd_sum += arr[i];}
    
    System.out.println(" Sum of all even element of array is- "+even_sum);
    System.out.println(" Sum of all odd element of array is- "+odd_sum);

    }
}