// 1	11	111	1111	  11111	……
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter term- ");
    int n= sc.nextInt();
    int i=1, a=1, b=10;
    while(i<=n){
        System.out.print(" "+a);
        a+=b;
        b*=10;
        i++;
    }
    }
}