//WAP to find out all the palindrome numbers between two entered numbers.
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

   System.out.println("Enter two numbers- ");
    int num1= sc.nextInt();
    int num2= sc.nextInt();

    int reverse=0, digit=0;
    int original=num1;

    while(num1<=num2){
    
        for(int i=num1; i>0; i++){
        digit=num1%10;
        reverse= reverse*10+digit;
        num1=num1/10;;
        }
        if(original==reverse)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
        num1/=10;
    }
        /*System.out.println("Enter the string");
        String name= sc.nextLine();

        String str=" ";
        String original=name;
        int l=name.length();
        System.out.println(l);

        for(int i=l-1; i>=0; i--){
            str= str+name.charAt(i);
        }
        if(n==str)
            System.out.println("Palindrome");
            else
            System.out.println("not Palindrome");*/
    }
    }

