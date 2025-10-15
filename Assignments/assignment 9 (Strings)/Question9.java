/*WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
				  TRIANGLE - INTEGRAL)
 */
class Main{
	public static void main(String[]args){
		String s = "LISTEN";
		String s2 = "SILENT";

		if(s.length()!= s2.length())
		System.out.println("Strings are not anagrams.");
		
		else{
			if(s.contains(s2))
			System.out.println("It is anagram.");


			
		}

	}
}