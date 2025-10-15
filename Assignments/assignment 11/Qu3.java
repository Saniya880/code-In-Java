interface BonusEligible {
    abstract void giveBonus();
}
abstract class  Employee{

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
        public double  setSalary(double salary)
        {
        return salary;
        }
        abstract void calculateSalary();

        public void showDetails()
        {
            System.out.println("Id of Employee - "+this.id);
            System.out.println("Name of Employee- "+this.name);
            System.out.println("Salary of Employee- "+this.setSalary());
        }
}
class FullTimeEmployee extends Employee implements BonusEligible{
    private double salary_monthly;

    public FullTimeEmployee(int id, String name, double salary_monthly){
        super(id,name);
        this.salary_monthly = salary_monthly;
    }

    public void BonusEligible(){
        System.out.println("Eligible for bonus...");
    }

    public void calculateSalary(){
        super.setSalary(salary_monthly);
        super.showDetails();
        
    }

}
class Main{
    public static void main(String[]args){
        Employee obj = new FullTimeEmployee(1, "Thomas", 50000.0);
        obj.calculateSalary();
    
    }
}