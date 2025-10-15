// WAP to find greater among three number
import java.util.Scanner;
class Q22{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        num3 = sc.nextInt();
        if ((num1>num2) && (num1>num3))
        System.out.println("Number 1:   "+num1 + "is greater.");
        if ((num2>num1) && (num2>num3))
        System.out.println("Number 2:  "+num2+ "is greater.");
        else{
            System.out.println("Number 3: "+num3 + " is greater.");
        }
        
    }
}