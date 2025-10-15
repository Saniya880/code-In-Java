//WAP to sort the array
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array- ");
    int n= sc.nextInt();

     int a[]= new int[n];
     int temp,j,i;

     for(i=0; i<n; i++){
        System.out.println("Enter "+(i+1)+" element in array");
        a[i] = sc.nextInt();
     }

    for (i=0; i<a.length; i++){   
     for(j=i+1; j<a.length; j++){                                                                                                  
                 if(a[i]>a[j]){
                temp=a[i];
                a[i]= a[j];
                a[j]= temp;}}

             System.out.print(" "+a[i]);
        }
        }
    }
    