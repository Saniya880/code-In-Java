// WAP to find word of maximum length in given String.
import java.util.Scanner;
class Main{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any string");
	String input = sc.nextLine();

	String[] arr = input.split(" ");
	for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);
	}
	

	}
}