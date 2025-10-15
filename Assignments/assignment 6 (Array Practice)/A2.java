//Find minimum and maximum element in array
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int i=0;

    System.out.println("Enter size of array");
    int n=sc.nextInt();

    int a[]= new int[n];

    for(i=0; i<n; i++){
    System.out.println("Enter "+(i+1)+" elements in array");
    a[i]= sc.nextInt();}

    /*int max = a[0];
    for( i=0; i<n; i++){
        if(a[i] > max){
            max=a[i];
        }}

    int min = a[0];
       for( i=0; i<n; i++){
        if(a[i]< min){
            min = a[i];
        }
       }*/

      int max = Integer.MIN_VALUE;
      for( i=0; i<n; i++){
        if(a[i] > max)
            max=a[i];
        }
        int min = Integer.MAX_VALUE;
      for( i=0; i<n; i++){
        if(a[i] > min)
            min=a[i];
        }

    System.out.println("Maximum value=  "+max);
    System.out.println("Minimum value=  "+min);
    }
}