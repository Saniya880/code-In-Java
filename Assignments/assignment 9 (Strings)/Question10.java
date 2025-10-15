//WAP check if a String contains only digits?
class Main{
    public static void main(String[]args){
        String input = "Saniya khan";
        
        String word [] =  input.split("");
        for(int i=0; i<word.length; i++){
            System.out.println(word[i]);
        }

        for(int i=0; i<word.length; i++){
            String  w = word[i];
            for(int j=0; j<w.length(); j++){
                 String rev  = w.charAt(j);            
            }
        }
    System.out.println(rev);
    }
}