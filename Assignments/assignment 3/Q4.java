import java.util.Scanner;       // Nested if 
class Q4{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int marks;
        System.out.println("Enter your marks");
        marks = sc.nextInt();
        if (marks >= 80)  
        System.out.println("Grade- A");
        if (marks < 80 && marks >= 60)
        System.out.println("Grade - B");
        if (marks < 60 && marks >= 50)
        System.out.println("Grade - C");      
        if (marks < 50 && marks >= 45)
        System.out.println("Grade - D");
        if (marks < 45 && marks >= 25)
        System.out.println("Grade - E");
        if(marks < 25)
        System.out.println("Grade- f");
    }
}