//25) 1	27	125	343	…………	
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter nth term");
    int n=sc.nextInt();

    int a=1,b=1,i=1;
    while(i<=n){
        System.out.println(a);
        b+=2;
        a=b*b*b;
        i++;
    }
    }
}