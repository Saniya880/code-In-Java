import java.util.Scanner;
class P12{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double h, b, hypo, base, l, length , area;
        System.out.println("Enter height of triangle- ");
        h=sc.nextDouble();
        System.out.println("Enter breadth of triangle- ");
        b=sc.nextDouble();
        hypo= h*h;
        base= b*b;
        l=hypo - base;
         length= Math.sqrt(l);
         area= 0.5*length*b;
        System.out.println("Length =  "+length);
        System.out.println("Area of right Angle is =  "+area);


    }
}
