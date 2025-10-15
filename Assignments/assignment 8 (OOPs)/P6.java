//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
import java.util.Scanner;
class Employee {
    private String name, jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary){
        this.name =  name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getDAta(){
        return name+" : "+jobTitle+" : "+salary;
    }
    public void setData(String name, String jobTitle, int salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
     public void  calculate(float percent){
        if(percent > 0){
            salary += salary*(percent/100f);
        }
    }
    public  void display (){
        System.out.println("-------------------------------------------------------------";)
        System.out.println("Employee Name: "+name+"\nJob: "+jobTitle+ "\nSalary: "+salary);
    }

} 
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of employees - ");
        int n= sc.nextInt();
        
        Employee employee[] = new Employee[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Enter details of Employee "+(i+1)+"  Name- ");
            String name = sc.nextLine();
            System.out.println(" Job title- ");
            String jobTitle= sc.nextLine();
            System.out.println("Salary- ");
            int salary = sc.nextInt();
            employee [i] = new Employee ( name, jobTitle, salary);
        } 
        for (int i=0; i<n; i++){
            employee[i].display();
        }
           }
}