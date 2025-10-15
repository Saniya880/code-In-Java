/*Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method.*/
import java.util.Scanner;
class Employee{

  private  static int empNo = 0;
  private float salary;
  private static  float total_salary;

  public Employee(){}

  public Employee(float salary){
    this.salary = salary;
    empNo++;
  }
  public static  int getEmployee(){
    return empNo;
  }
  public static  float getTotalSalary(){
    return total_salary+=salary;
  }

  public  static void display(){
    System.out.println("Total no of employee - "+getEmployee());
    System.out.println("Total salary - "+getTotalSalary());
  }
}
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);


    System.out.println("Enter no of employee-");
    int n = sc.nextInt();

  Employee obj[] = new Employee[n];
  Employee e = new Employee();

  for(int i=0; i<n; i++){
    sc.nextLine();
    System.out.println("Enter salary of employee ");
    float salary = sc.nextFloat();
    obj [i] = new Employee(salary);
  }
  Employee.display();

  
    
    
  




  }
}