/* Checked vs Unchecked Exception

👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior.*/
import java.util.Scanner;
import java.io.*;
class Test{
    public void methodCheck() throws IOException {
        throw new IOException();
            }
    public void methodUncheck (int a, int b){
        int c= a/b;
        System.out.println(c);
    } 
}
class TestMain{
    public static void main(String [] args){
        Test obj = new Test();
       /* try{
        obj.methodCheck();
        }
        catch(IOException e){
           e.printStackTrace();
        }*/
       obj.methodCheck();
        try{
            obj.methodUncheck(3,0);
        }
        catch(ArithmeticException e ){
            System.out.println("Enter correct number...");
        }
        System.out.println("Execution succesfull...");
    }
}
