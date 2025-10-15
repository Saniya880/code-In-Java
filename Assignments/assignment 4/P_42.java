//42) WAP to find out HCF of a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter two number to find out HCF- ");
    int x= sc.nextInt();
    int y= sc.nextInt();

    int min=0,h=0;
    if(x<y)
    min=x;
    else
    min=y;
    for(int i=1; i<=min/2; i++){
        if( x%i==0 && y%i==0 ){
            h=i;
        }
    }
        System.out.println("HCF  of "+x+" and "+y+" is " +h);

    }
}