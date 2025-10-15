import java.util.Scanner;
class Q10{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int year;
        System.out.println("Enter any year");
        year= sc.nextInt();     
        if( year%4==0){
        System.out.println("This is a leap year. ");
        if(year%400==0 && year%100==0){
            System.out.println("This is a leap centuary");
        }else {
            System.out.println("This is a not leap centuary");
        }}
        else {
        System.out.println("This is not a leap year");
        }
    }
}