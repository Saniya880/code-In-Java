//Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
import java.util.Scanner;
class Employee {

    private String name;
    private int hireDate;
    private   double salary;

    public Employee(String name, int hireDate, double salary){
        this.name = name;
        this.hireDate= hireDate;
        this.salary = salary;
    }

     public int yearOfService(){
        if (hireDate != 0)
            return 2025 - hireDate;
            else 
            return 0;
    }
    public Employee(){}
    
      public void display(){
        System.out.println("Name- "+this.name+"\nSalary- "+this.salary+"\nDate of joining- "+this.hireDate+"\nYears till now- "+this.yearOfService());
        System.out.println("-----------------------------------------------------------");
     }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of employee");
        int n= sc.nextInt();
        Employee obj = new Employee ();

        Employee[] arr = new Employee [n];

        for(int i=0; i<arr.length; i++){
            sc.nextLine();
        System.out.println("Enter name of Employee- ");
        String name=sc.nextLine();
        System.out.println("Enter salary-  ");
        double salary = sc.nextDouble();
        System.out.println("Enter Joining Year- ");
        int  hireDate = sc.nextInt();
        arr[i] = new Employee(name, hireDate, salary);
        }
        //int r= obj.yearOfService();
        //System.out.println(r);
        for(int i=0; i<arr.length; i++){
        arr[i].display();
        }
    }
}

   


    
