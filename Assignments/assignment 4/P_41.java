// WAP to find out LCM of a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter two numbers-");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int max=0,l=0;
    if(x>y)
    max=x;
    else
    max=y;

    while(true){
        if(max % x == 0 && max % y== 0){
         l=max;
        break;}
        max++;
    }
    System.out.println("LCM of the given number "+x+" and "+y+" is " +l);
    }
}