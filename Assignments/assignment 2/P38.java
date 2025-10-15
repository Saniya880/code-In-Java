import java.util.Scanner;
class P38{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter volume of cylinder ");
        double volume= sc.nextInt();
        System.out.println("Enter radius of cylinder ");
        double r = sc.nextInt();

        double h=volume/3.14*r*r;
        double surface=3.14*r*(r+h);
        System.out.println("h = "+h);
        System.out.println("Surface area =  "+surface);
}
}