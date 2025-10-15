//Write a java program to reverse each word of String.
import java.util.Scanner;
class StringInput{
    private String input;

    public StringInput(String input){
        this.input = input;
    }
    public String getData(){
        return input;
    }
}
class Operation{

        public void performOperation(StringInput str){
            
            String data = str.getData();
            String word [] =data.split(" ");
           String rev = "";

           for (int i=0; i<word.length; i++){
            for(int j=word[i].length()-1; j>=0; j--){
                rev = rev+ word[i].charAt(j);
            }
           rev += " ";
           }
           System.out.println(rev);
        }
      }

class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any String");
        String input = sc.nextLine();

        StringInput obj = new StringInput (input);
        Operation op = new Operation();
        op.performOperation(obj);

    }
}
/*class Main{
    public static void main(String[]args){
    String input = "java is platform independent";
    String word[] = input.split(" ");
    String rev = "";

    for(int i=0; i<word.length; i++){
        for (int j=word[i].length()-1; j>=0; j--){
            rev = rev + word[i].charAt(j);
        }
       rev +=" ";
    }
    System.out.println(rev);
    }
}*/