//WAP to delete element from array at specific position.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    int a[]= {10, 20, 30, 40, 50};
    System.out.println("Enter desired position to delete-");
    int position= sc.nextInt();
    int temp=0,i, n=a.length;                             

    if(position>(n+1) || position<1)
    System.out.println("Invalid position!");

    else{
     a[position-1]=0;                                        
    }


    for(int j=0; j<n; j++)
    System.out.println(a[j]);                                
    }
}