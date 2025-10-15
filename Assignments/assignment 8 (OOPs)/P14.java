//Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

import java.util.ArrayList;
class School{
     String className;
    School(String className){
        this.className=className;
    }


}
class Classes{
    ArrayList<String> teacher;
    ArrayList<String> student;
    String className;
    public Classes(String className){
        this.className=className;
        this.teacher=new ArrayList<String>();
        this.student=new ArrayList<String>();
    }
    public void addStudent(String student1){
        student.add(student1);
    }
    public void removeStudent(String student1){
        student.remove(student1);
    }
   public void addTeacher(String teacher1){
        teacher.add(teacher1);
    }
    public void removeTeacher(String teacher1){
        teacher.remove(teacher1);
    }
    public Classes(){};
    public void display(){
        System.out.println("teachername="+teacher);
       System.out.println("student="+student);
       System.out.println("classname="+className);


    }

}
class Test{
    public static void main(String args[]){
    Classes c=new Classes("12");
    c.addTeacher("riya");
    c.addTeacher("priya");
    c.addStudent("yash");
    c.addStudent("yashi");
    c.addStudent("khushi");
    c.display();
    
    c.removeStudent("khushi");
    c.display();



    }
}
