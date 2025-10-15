import java.util.Scanner;
import java.io.*;
class TestMain{
    public static void main(String[]args){

        try(FileWriter fw = new FileWriter("xyz.txt",true);
            Scanner sc = new Scanner(System.in);){
            String data = "Java is a robust.";
            fw.write(data);
            System.out.println("Written succesfull...");
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }}
