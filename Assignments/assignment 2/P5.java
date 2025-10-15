import java.util.Scanner;
class P5{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double fencingCost, area, breadth, perimeter, perRate, length;
        System.out.println("Enter the cost of rectangular fence");
        fencingCost= sc.nextDouble();
        System.out.println("Enter the rate in per meter square");
        perRate= sc.nextDouble();
        System.out.println("Enter the length of fencing");
        length= sc.nextDouble();
        perimeter= fencingCost/perRate;
        breadth=(perimeter - length/2);
        area= length*breadth;
        System.out.println("Perimeter - "+perimeter);
        System.out.println("Breadth - "+breadth);
        System.out.println("Area - "+area);
        
    }
}