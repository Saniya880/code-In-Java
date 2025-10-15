
import java.util.Scanner;
class P37{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter area- ");
        float area = sc.nextFloat();

        System.out.println("Enter height- ");
        int height = sc.nextInt();
        double radius= area/(2*3.14*height);
        double diameter= radius*2;

        System.out.println("Diameter= "+diameter);
    }
}