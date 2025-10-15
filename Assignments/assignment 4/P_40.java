// WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter any number- ");
    int num=sc.nextInt();

    int digit=0,even=0, odd=0;
    while(num!=0){
        digit=num%10;
        if(digit%2==0)
            even++;
            else
            odd++;
            num/=10;
    }
    System.out.println("There are  "+even+" even digit and  "+odd+" odd digit in the given number.");
    
    }
}