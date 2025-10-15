/*Employee Record System
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details.*/

class Employee{

    private int id;
    private int salary;
    private String name;
    
    public void setN(String name){
        this.name = name;
    }

    public void setS(int salary){
        this.salary= salary;
    }

    public void setI(int id){
        this.id = id;
    }

    public void display(){
        System.out.println("Employee id- "+id);
        System.out.println("Employee name- "+name);
        System.out.println("Salary - "+salary);
    }
}
class Main{
    public static void main(String[]args){

        Employee obj= new Employee();
        obj.setN("Saniya");
        obj.setS(50000);
        obj.setI(101);
        obj.display();

    }
}
