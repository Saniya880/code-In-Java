import java.util.Scanner;
class Q31{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println(" Press 'F' to convert Celsius to Fehrenheit");
        System.out.println("Press 'C' to convert Fehrenheit to Celsius");
        char choice= sc.next().charAt(0);
        switch(choice){
            case 'F':
            System.out.println("Enter the temperature in Celsius:");
            double c =sc.nextDouble();
            double f=(c*9)/5+32;
            System.out.println("Temperature in fehrenheit: "+f);
            break;
            case 'C':
                System.out.println("Enter the temperature in fehrenheit:");
                f=sc.nextDouble();
                c=(f-32)*5/9;
                System.out.println("Temperature in celsius: "+c);
                break;
                default:
                 System.out.println("Invalid choice");
        }
    }
}