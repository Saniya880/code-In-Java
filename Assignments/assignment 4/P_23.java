//23) 1	9	25	49	81	....
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter number of terms- ");
    int n= sc.nextInt();

    int a=1,i=1;
    while(i<=n){
        System.out.println(a*a);
        a+=2;
        i++;
        
    }
    }
}