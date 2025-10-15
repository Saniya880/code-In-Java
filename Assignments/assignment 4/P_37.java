// WAP to check whether entered number is palindrome or not
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter number to check it is palindrome or not-");
     int n= sc.nextInt();

     int reverse=0,digit=0,number=n;
     while(n!=0){
        digit= n%10;
        reverse=reverse*10+digit;
        n=n/10;
     }

     if(number==reverse){
      System.out.println(number+ " is a palindrome.");
    }
    else{
     System.out.println(number+" is not a palindrome.");
     }
    }}
