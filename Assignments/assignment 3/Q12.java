/*12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */

import java.util.Scanner;
class Q12{
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter any 4 digit number. (it should be an integer)");
    int num  = sc.nextInt();
        int a = num;
        int digit=0;
        digit =  digit * 10 + a%10;
        a=a/10;
         digit= digit * 10 + a%10;
        a =a/10;
         digit= digit * 10 + a%10;
        a=a/10;
         digit= digit * 10 + a%10;
        a=a/10;
        System.out.println("original number = "+num+" \n reversed number = "+digit);
    
}



}