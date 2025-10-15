//Write a java program to find all possible palindrom of given String.
import java.util.Scanner;
class StringOperation{
    private String str;
    public StringOperation(String str){
        this.str = str;
    }
    public void setData(String str){
        this.str = str;
    }
    public String getData(){
        return str;
    }
    public void operation(){
        String rev = "";
        for (int i=0; i<str.length(); i++){

            rev = str.charAt(i)+ rev;
        }
        if(str.equals(rev))
            System.out.println("It is Palindrome");
            else
            System.out.println("not Palindrome");        
    }
}
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string");
        String str = sc.next();
        
        StringOperation obj = new StringOperation(str);
        obj.operation();
        
        
    }
}
