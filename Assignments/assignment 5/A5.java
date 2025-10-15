// WAP to replace all element with 0 which is multiple of 5
import java.util.Scanner;
class Array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter data size- ");
        int n= sc.nextInt();

        int arr[] = new int [n];
        int i;

        System.out.println("Enter elements in array-");
        for ( i=0; i<arr.length; i++)
        arr[i] = sc.nextInt();

       
        for( i=0; i<(arr.length); i++){
        if(arr[i]%5==0)
        arr[i]=0;
        System.out.print(" "+arr[i]);

        }
    }
}