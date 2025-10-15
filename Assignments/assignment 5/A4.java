//WAP to find an element in array.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

        System.out.println("Enter data size- ");
        int n= sc.nextInt();

        int arr[] = new int [n];
        int i;
        boolean status=false;

        System.out.println("Enter an elements in array-");
        for ( i=0; i<arr.length; i++)
        arr[i] = sc.nextInt();

        System.out.println("Enter element to find- ");
        int element= sc.nextInt();

        for( i=0; i<arr.length; i++){
        if(arr[i]==element){
        status=true;
        break;}
        }
        if(status)
         System.out.println("found element "+arr[i]+ " at position- "+i);
        else
        System.out.println("element not found");
               
            
    }
}