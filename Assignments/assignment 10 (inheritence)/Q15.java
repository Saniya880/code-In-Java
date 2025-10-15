/*Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array                  
one double and one integer
*/
import java.util.Scanner;
class MathOperation{
  
  public int multiply(int x, int y){
        int a=x;
        int  b=y;
    int result =  a * b;
    return result;
  }
  public float multiply(float x, float y, float z){
      float a=x;
      float b=y;
       float c=z;
    float result = a * b *c;
    return result;
  }

  public void multiply(int a []){
     int multi =1;
    for(int element : a){
      multi*=element;
    } 
     System.out.println(multi);
  }
  public double multiply(double x, int y){
        double a=x;
        int b=y;
    double result = a * b ;
    return result;
  }
  
}
class Main {
     public static void main(String args[]){
        MathOperation op =  new MathOperation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array- ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements of array- ");
        for(int i=0; i<arr.length; i++)
        arr[i] = sc.nextInt();
        
        System.out.println(op.multiply(3,4));
        System.out.println(op.multiply(2.5f,4.5f,3.6f));
        op.multiply(arr);
        System.out.println(op.multiply(36.0,4));
        
    }
}