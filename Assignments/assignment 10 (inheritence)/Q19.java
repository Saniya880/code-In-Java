/*Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].*/

import java.util.*;
class Student {
    String name;
    int  rollNo;
    int age;
    float score;

    public Student(String name, int rollNo, int age, float score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }
    public float getScore(){
        return score;
    }
    public String getData(){
        return "Name: "+name+" RollNo :  "+rollNo+ "  Age:  "+age+"  Score:  "+score;
    }
   }

 class MarksDistribution{

   private ArrayList <Student> group1 = new ArrayList <Student> ();
   private ArrayList <Student> group2 = new  ArrayList <Student> ();
   private ArrayList <Student> group3 =  new ArrayList <Student> ();
    private ArrayList <Student> group4 =  new ArrayList <Student> ();

    public void addGroup(Student []s){
        for(Student i : s){
        if(i.getScore() >80 && i.getScore() <=100){
            group1.add(i);
        }
        else if(i.getScore() <=80 && i.getScore() >65){
            group2.add(i);
         }
         else if(i.getScore() <=65 && i.getScore() >50){
            group3.add(i);
          }
        else{
            group4.add(i);
            }
 }}
          public void display(){
            for(Student i : group1){
               System.out.println("-------------------------------------------------");
               System.out.print("\n Student got score under  [80-100]: "+i.getData());
               }
            for(Student i: group2){
            System.out.println("-------------------------------------------------");
            System.out.print("\n Students under  [65-80]: "+i.getData());
               }
            for(Student i: group3){
             System.out.println("-------------------------------------------------");
            System.out.print("\n Students under  [50-65]: "+i.getData());
               }
            for(Student i: group4){
            System.out.println("-------------------------------------------------");
             System.out.print("\n Students under  [0-50]: "+i.getData());
               }
        }
 } 
class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    Student students[] = new Student[10];

    for(int i=0; i<students.length; i++){
        sc.nextLine();

    System.out.println("Enter name of student: ");
    String name = sc.nextLine();

    System.out.println("Enter roll no:  ");
    int roll_no = sc.nextInt();

    System.out.println("Enter age of student: ");
    int age = sc.nextInt();

    System.out.println("Enter score of student: ");
    float score = sc.nextFloat();

    students [i] = new Student(name, roll_no, age, score);  }

    MarksDistribution md = new MarksDistribution();
    md.addGroup(students);
    md.display();
    }
}
