
// Find the kth largest and kth smallest element in array.
import java.util.*;
class TestArray{

    public void sortArray(int a[], int k){
       /* int temp=0, n=a.length;
          
        for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
         if(a[i]> a[j]){
            temp = a[i];
             a[i] = a[j];
            a[j] = temp;}
         }}*/
         
        // for(int i=0; i<n; i++){                      sorted array...
         //   System.out.print(" "+a[i]);
     // } 
        Arrays.sort(a);
         
      System.out.println("\n"+k+" th smallest element in array is "+a[k-1]);
      System.out.println(k+ " th largest element in Array is "+a[a.length-k]);
        }
    }
class Main{
    
public static void main(String[]args){
Scanner sc= new Scanner (System.in);


System.out.println("Enter size of Array- ");
int n = sc.nextInt();
int a[] = new int[n];

System.out.println("Enter element in array");
for(int i=0; i<n; i++)
a[i] = sc.nextInt();


System.out.println("Enter the position");
int k = sc.nextInt();

TestArray obj = new TestArray();
obj.sortArray(a,k);


}
}