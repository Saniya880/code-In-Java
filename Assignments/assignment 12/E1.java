/*1. Divide by Zero Exception

 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// Expected
Enter first number: 10
Enter second number: 0
java.lang.ArithmeticException caught: / by zero*/
class TestMain{
    public static void main(String[]args){

        int num1 = 10;
        int num2 = 0;

        try{
            int result = num1/num2;
            System.out.println(result);
          }
        catch(ArithmeticException e ){
            e.printStackTrace();
        }
        System.out.println("Program excecute succesfull...");
}}

