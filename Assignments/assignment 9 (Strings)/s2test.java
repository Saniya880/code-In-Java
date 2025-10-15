/* String Problem #2

Reverse Each Word in a Sentence

Input: "Java makes coding fun"

Output: "avaJ sekam gnidoc nuf"

Keep the word order intact but reverse the characters of each word.*/
class Test{
    public static void main(String[]args){
        String input = "Java makes coding fun";
        String word[] = input.split(" ");

        //for(String w : word)
        //System.out.println(w);

        String output = " ";

        for(int i=0; i<word.length; i++){
            for(int j=word[i].length()-1; j>=0; j--){
            output =   output + word[i].charAt(j);
        } output= output+ " ";
        }
        System.out.println(output);
    }
}
