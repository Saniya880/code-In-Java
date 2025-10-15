//Check given character is vowel or not using switch case
import java.util.Scanner;
class Q27{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character-");
        char ch= sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
        System.out.println("Given character -" +ch + "is vowel.");
        else
        System.out.println("Given character is not a vowel.");
    }
}