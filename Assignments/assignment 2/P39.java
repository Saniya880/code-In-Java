import java.util.Scanner;
class P39{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter diameter- ");
        float diameter= sc.nextFloat();
        float r= diameter/2f;

        System.out.println("Enter height-");
        int h= sc.nextInt();
        double area= 2*3.14*r*(r+h);

        System.out.println("Area - "+area);
    }
}