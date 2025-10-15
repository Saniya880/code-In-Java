// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
class Q9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = sc.next().charAt(0);
         if ((ch!='a') && (ch!='z') || (ch!='A') && (ch!='Z'))
        System.out.println("Invalid Initilization");
        else if (ch>='a'&& ch<='z')
        System.out.println("This is a lowercase character.");
        else if(ch>='A' && ch<='Z')
        System.out.println("This is a uppercase character.");
        
    }
}