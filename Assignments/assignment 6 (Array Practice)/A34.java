// Write a java program to implement linear search
import java.util.Scanner;
class TestArray{

    public void searchElement(int a[],int element){
        for(int i=0; i<a.length; i++){
            if( element == a[i]){
                System.out.println("Element fount at "+(i+1)+" position in Array.");
                break;
            }
            else 
            System.out.println("Element not found in Array");
            break;
        }
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter element in array");
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to check in array");
        int element = sc.nextInt();
        
        TestArray t = new TestArray();
        t.searchElement(a,element);
    }
}