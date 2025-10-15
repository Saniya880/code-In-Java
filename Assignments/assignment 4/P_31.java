// 9	99	999	9999	  99999 …….
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter nth term- ");
    int n= sc.nextInt();

    int i=1, a=9, b=100;
    while(i<=n){
        System.out.print(a+" ");
        a=b-1;
        b*=10;
        i++;
    }
    }
}