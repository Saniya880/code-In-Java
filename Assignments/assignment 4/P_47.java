// WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two number-");
    int num1= sc.nextInt();
    int num2= sc.nextInt();

    while(num1<=num2){
        for(int i=1; i<=10; i++){
            System.out.print(" "+num1*i);
        } System.out.println();
        num1++;
    }


    }
}