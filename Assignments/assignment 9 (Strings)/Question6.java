//10) WAP to count the word whose first letter is  vowel.
import java.util.Scanner;
class Check{

    public void checkVowel(String[] arr){
        int count = 0;
    for(String s : arr){
            char ch = s.charAt(0);
            if (ch =='a' || ch =='e'|| ch =='i' || ch =='o'|| ch =='u'|| ch =='A'|| ch =='E' ||ch =='I' || ch =='O'|| ch =='U')
            count++;
        }
        System.out.println("\n"+ count);
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the sentence- ");
        String sentence = sc.nextLine();

        String [] word = sentence.split(" ");
        
        for (int i=0; i<word.length; i++){
            System.out.print(word[i]);
        }   

        /*for(String s : word){
            char ch = s.charAt(0);
            if (ch =='a' || ch =='e'|| ch =='i' || ch =='o'|| ch =='u'|| ch =='A'|| ch =='E' ||ch =='I' || ch =='O'|| ch =='U')
            count++;
        }
        System.out.println("\n"+ count);*/
          Check obj = new Check ();
          obj.checkVowel(word);
    
    }
}
