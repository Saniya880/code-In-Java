import java.util.Scanner;
class P9{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int side;
        System.out.println("Enter side of triangle");
        side= sc.nextInt();
        float area = (float)(1.732/4*side*side);
        System.out.println("Area of equilateral triangle - "+area);
    }
}
    
