import java.util.Scanner;
class P35{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius- ");
        float r= sc.nextFloat();
        System.out.println("ENter height- ");
        int h= sc.nextInt();

        double area= 2*3.14*r*(r+h);
        System.out.println("Area - "+area);

    }
}