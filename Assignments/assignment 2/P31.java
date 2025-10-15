import java.util.Scanner;
class P31{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter perimeter- ");
    int p= sc.nextInt();
    
    int side=p/4;
    int area= side*side;

    System.out.println("Area= "+area);
    }
}
