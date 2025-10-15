// WAP to calculate the percentage of students
import java.util.Scanner;
class Q18{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);

        float english , maths, physics, chemistry, hindi, total, percentage;

        System.out.println("Enter the number of english");
        english = sc.nextInt();
        System.out.println("Enter the number of maths");
        maths = sc.nextInt();
        System.out.println("Enter the number of  physics");
        physics= sc.nextInt();
        System.out.println("Enter the number of chemistry ");
        chemistry = sc.nextInt();
        System.out.println("Enter the number of hindi");
        hindi = sc.nextInt();

        total = english + maths + physics + chemistry + hindi;
        percentage = (total *100)/500;

        if(percentage > 0 && percentage > 33){
        System.out.println("\"PASS\" \n Percentage  = "+percentage);}
        else if (percentage == 0 || percentage < 0){
            System.out.println("Invalid marks ... Enter correct marks");
        }
        else
        System.out.println(" \"FAIL\" ");
    }
}