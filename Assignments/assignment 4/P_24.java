//24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the number of term");
    int n=sc.nextInt();

    int a=0,i=1;
    while(i<=n){
      System.out.println(a*a);
        a=a+2;
        i++;
    }
    for (i=1; i<=n; i++)
    System.out.println(i);
    }
}