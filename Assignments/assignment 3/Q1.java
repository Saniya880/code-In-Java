import java.util.Scanner;
class Q1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int length , breadth, result;
        System.out.println("Enter the value of length");
        length = sc.nextInt();
        System.out.println("Enter the value of breadth ");
        breadth = sc.nextInt();
        if (length == breadth )
        System.out.println("It is a square. ");
        else
        System.out.println("It is not a square");

    }
}