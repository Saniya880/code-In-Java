// WAP to find out all the perfect numbers between two entered numbers.
import java.util.Scanner;
 class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers- ");
    int num1= sc.nextInt();
    int num2= sc.nextInt();

   
         while(num1<=num2){
         int sum=0, number=0;
        number=num1;
        for(int i=1; i<=num1/2; i++){
            if(num1 % i == 0){
                sum+=i;
            }
        }
        System.out.println();
        if(number == sum){
            System.out.println(num1+" given number is a perfect.");
        }
        else{
        System.out.println(num1+" given number is not a perfect.");}
        num1++;
    }
    }
 }
