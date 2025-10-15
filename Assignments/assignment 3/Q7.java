import java.util.Scanner;
class Q7{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int classes,attended;
        System.out.println("Enter the no of classes - ");
        classes =  sc.nextInt();
        System.out.println("Enter the no of attended- ");
        attended= sc.nextInt();
        float attendence = (attended*100f)/classes;
        System.out.println("Your Attendence- "+attendence);
        if (attendence >= 75)
        System.out.println("YOu're eligible for exam");
        else
        System.out.println("you're not eligible for exam because your attendence is less than 75 %.");
    }
}