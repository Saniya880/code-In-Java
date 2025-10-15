//Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
import java.util.Scanner;
class Method{

    ArrayList<Student> al= new ArrayList <Student> ();
    public void addCourses(Student s){
        al.add(s);
    }
    public void removeCourses(Student s){
        al.remove(s);
    }
    public void display(){
    for(Student s : al )
        System.out.println(s.getDetails());
    }
}
class Student{

    private String name;
    private String grade;
    private String course;

    public Student(String name, String grade, String course){
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
     public String getDetails(){
 System.out.println("------------------------------------------");
         return "Name- "+name+"\nGrade- "+grade+"\nCourse- "+course;
        
     }
}
class Main{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students- ");
        int n = sc.nextInt();

        Student[] student = new Student [n];
        for(int i=0; i<student.length; i++){
            sc.nextLine();
            System.out.println("Enter name of student- ");
            String name= sc.nextLine();
            System.out.println("Enter grade of student- ");
            String grade= sc.nextLine();
            System.out.println("Enter Course of student-");
            String course = sc.nextLine();
            student [i] = new Student(name, grade, course);
        }
        Method m = new Method();
        
        for(int i=0; i<student.length; i++){
        m.addCourses(student[i]);}
    
        m.display();
        

    }
}