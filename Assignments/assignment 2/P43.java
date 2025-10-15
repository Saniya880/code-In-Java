import java.util.Scanner;
class P43{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double height, length,r, area, rate=10.0;
        System.out.println("Enter the height - ");
        height=sc.nextDouble();
        System.out.println("Enter the Length ");
        length= sc.nextInt();
        r= length*length - height* height;
        double radius = Math.sqrt(r);
        area= (3.14*radius *radius);
         rate= (area*10.0);
        System.out.println("Radius = "+radius);
        System.out.println("Area of cone=   "+area);
        System.out.println("Rate in per meter square   "+rate);

    }
}