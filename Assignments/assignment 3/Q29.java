// WAP to find lowest number among four different number
import java.util.Scanner;
class Q29{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        if ((a<b) &&(a<c) && (a<d) )
        System.out.println(+a +" is the lowest number among all number.");
        else if( (b<c) && (b<d))
        System.out.println(+b + " is the lowest number among all number.");
         else if (c<d)
        System.out.println(+c + " is the lowest number among all number.");
         else 
        System.out.println(+d + " is the lowest number among all number.");


    }
}