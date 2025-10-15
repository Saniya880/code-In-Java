// Peak element.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter size of array- ");
    int n= sc.nextInt();
    int arr[]= new int[n];

    for(int i=0; i<n; i++){
     System.out.println("Enter  "+(i+1)+" element of array");
    arr[i]= sc.nextInt();}

    System.out.println("Enter index - ");
    int index= sc.nextInt();

    if(index < 0 || index >= n) {
    System.out.println("Invalid index..."); 
    return; }

    if( (index == 0 && arr[0] >= arr[1]) || (index == n-1 && arr[n-1] >= arr[n-2] ))
    System.out.println("1");

    else if ( ( arr[index] >= arr[index-1] && arr[index]>= arr[index+1]))
    System.out.println("1");

    else
    System.out.println("0");
    }}

    