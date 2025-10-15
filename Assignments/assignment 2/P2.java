import java.util.Scanner;
class P2{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the area = ");
                int area = sc.nextInt();
         System.out.println("Enter the length = ");
                int l = sc.nextInt();
                int b= area/l;
                int p= 2*(l+b);
                System.out.println("b= "+b);
                System.out.println("perimeter= "+p);
                }
        }
