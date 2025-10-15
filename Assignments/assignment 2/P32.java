import java.util.Scanner;
class P32{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter side 1 for total Area- ");
    int side1 = sc.nextInt();

    System.out.println("Enter side 2 for swim Area- ");
    int side2 = sc.nextInt();

        int totalArea= side1*side1;
        int swimArea= side2*side2;
        int gardenArea= totalArea - swimArea;
        
        System.out.println("Remainning Garden Area= " +gardenArea);

    }
}