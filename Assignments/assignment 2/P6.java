import java.util.Scanner;
class P6{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        float hypo, h,b,base,l;

        System.out.println("Enter the height- ");
        h=sc.nextFloat();

        System.out.println("Enter the base- ");
        b =sc.nextFloat();

        base=b*b;
        hypo= h*h;
        l = hypo - base;

        double length=Math.sqrt(l);
        double area= 0.5*length*b;
        System.out.println(length);
        System.out.println("length-  "+length + " & Area of right angle triangle is  "+area);

        
    }
}