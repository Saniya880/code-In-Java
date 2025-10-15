import java.util.Scanner;
class Q3{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int salary,year;
        System.out.println("Enter your salary- ");
        salary= sc.nextInt();
        System.out.println("Enter your year of service -");
        year= sc.nextInt();
        System.out.println("your salary -  "+salary + "\n Service year- "+year);
        if(year>5)
        {
           float bonus= salary*5/100f;
           System.out.println("Congrates, you get 5% bonous \n your salary is -  "+(salary+bonus));
 
 }       
    }
}