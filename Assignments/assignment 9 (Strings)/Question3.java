//WAP to remove the duplicate letters from given String
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string.");
        String str = sc.nextLine();

        char arr[] = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; i<arr.length; i++){
                if(arr[i]==arr[j])
                arr[j]='k';
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'k')
            continue;
            System.out.print(arr[i]+" ");
        }
    }
}
