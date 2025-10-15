/*Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().*/
class Student{

    private String name;
    private int mathMarks;
    private int scienceMarks;
    private float avg;

    public void setData(String name, int m,int s){
        this.name = name;
        mathMarks = m;
        scienceMarks = s;
    }

    public float getAverage(){
        avg = ( mathMarks + scienceMarks )/2f;
        return avg;
    }
   }
   class Main{
    public static void main(String[]args){
    Student obj = new Student();

    obj.setData("Sara", 48, 58);
    System.out.println("Average of a given numbers -  "+obj.getAverage());
    }
   }