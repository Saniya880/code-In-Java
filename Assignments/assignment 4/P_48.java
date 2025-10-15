// WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter two numbers-");
    int num1= sc.nextInt();
    int num2 = sc.nextInt();
    int i;

    while(num1<=num2){
        for( i=1; i<=num1/2; i++){
            if(num1%i==0){
                System.out.print(" "+i);
            }
        }
    
        System.out.println();
        num1++;
    }
    }
}
