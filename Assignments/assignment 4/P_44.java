//44) WAP to interchange first and last digit of a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    /*System.out.println("enter any number- ");
    int n=sc.nextInt();*/

     int number=452,first=number/100, last=number%10;
    System.out.println("Number before interchange-"+number);
    
    int reverse= last*100+5*10+first;
    System.out.println("Number after interchange- "+reverse);
    
    }    }
