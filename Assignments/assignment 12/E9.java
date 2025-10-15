/*Throws Keyword

 Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().*/
 import java.io.*;
 import java.io.File;
 class Test{

    public void readFile(String filename) throws IOException { 
         File f = new File(filename);
        throw new IOException();
    }

 }
 class TestMain{
    public static void main(String[]args){
        Test obj = new Test();
        try{
        obj.readFile("data.txt");
        }
        catch(IOException e){
        System.out.println("IO exception occur and handle...");
        }
        System.out.println("Execution Succesfull...");
    }
 }
