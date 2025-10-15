// 1+11+111+1111+11111+…. 
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the nth term- ");
    int n= sc.nextInt();

    int a=1,i=1, b=10, sum=0;
    while(i<=n){
        System.out.print(a+ " + ");
        sum=sum+a;
        a+=b;
        b*=10;
        i++;
    }
    System.out.println("\n Sum= "+sum);

    }    
}