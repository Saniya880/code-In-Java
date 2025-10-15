/* Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
*/
import java.util.Scanner;
class MathOperation{
    private float x,y;
    private double r;

    public MathOperation(){}
     
    public void init(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x and y");
    this.x = sc.nextFloat();
    this.y = sc.nextFloat();
    }
    public double add(){
      r= x+y;
      return r;
    }
    public double multiply(){
      r = x*y;
      return r;
    }
    public double  power(){
      r= Math.pow(x,y);
      return r;
    }
    public void display(){
    System.out.println("Addition of x and y is - "+add());
    System.out.println("Multiplication of x and y is -"+multiply());
    System.out.println("Power = "+power());
    }    
}
class Main{
  public static void main(String[]args){
    MathOperation obj = new MathOperation();
    obj.init();
    obj.display();
  }
}