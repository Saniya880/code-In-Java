/*3. ArrayIndexOutOfBoundsException

👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// Expected
Enter index: 8
java.lang.ArrayIndexOutOfBoundsException caught*/
import java.util.Scanner;


class Test{
    public void receiveArray(int arr[]){
        try{
            for(int i=0; i<5; i++){
                System.out.println(arr[8]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
           }
}}
class TestMain{
    public static void main(String[]args){
    
    int arr[] = {15, 45, 56, 82, 9};
    Test obj = new Test();
    obj.receiveArray(arr);
    
    }

}
