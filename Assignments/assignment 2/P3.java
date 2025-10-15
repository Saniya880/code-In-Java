import java.util.Scanner;
class P3{
    public static void main(String[]args){
Scanner sc= new Scanner(System.in);
double l1, b1, a1,tile,l2, b2, a2;
System.out.println("Enter the length 1 = ");
   l1 = sc.nextDouble();
      System.out.println("Enter the breadth 1 = ");
      b1 = sc.nextDouble();
      System.out.println("Enter the length 2 = ");
   l2 = sc.nextDouble();
      System.out.println("Enter the breadth 3 = ");
      b2 = sc.nextDouble();
    a1= l1*b1;
    a2= l2*b2;
    if(a2>a1){
        tile= a2/a1;
System.out.println("Required tiles = "+tile);
    }
    else{
        tile= a1/a2;
System.out.println("Required tiles = "+tile);
    }
    
    }
}