import java.util.Scanner;
class P1{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int perimeter, length  , area , breadth;
        System.out.println("Enter the perimeter of rectangle");
        perimeter =  sc.nextInt();
        System.out.println("Enter the length of rectangle");
        length= sc.nextInt();
        breadth= (perimeter - length)/2;
        area= length * breadth;
        System.out.println("breadth : "+breadth);
        System.out.println("Area : "+area);

    }
}