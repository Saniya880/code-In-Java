//26) 0	8	64	216	…………
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter number of terms- ");
    int n=sc.nextInt();

    int  a=0,b=0;;
    while(a<n){
        System.out.println(b);
        a+=2;
        b=a*a*a;
        
    }

    }
}