//Input name of a person and count how many vowels it contains. Use String class methods.
import java.util.Scanner;
class MyString{
    private String name;
    private static int count = 0;
    MyString (String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int countVowel(){
        
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch=='U' )
            count++;
        }
        return count;
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter any name- ");
        String name = sc.nextLine();

        MyString str = new MyString (name);

        int result = str.countVowel();
        System.out.println(result);
    }
}