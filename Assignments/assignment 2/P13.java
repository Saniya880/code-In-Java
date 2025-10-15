import java.util.Scanner;
class P13{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        float area, height, breadth;

        System.out.println("Enter the height of triangle - ");
        height = sc.nextFloat();

        System.out.println("Enter the area of triangle- ");
        area= sc.nextFloat();

        breadth=2*area/height;
        
    System.out.println("The other leg is  "+breadth + " cm.");
    }
}