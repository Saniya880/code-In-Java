 /* Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
 */
/*import java.util.Scanner;
class Array{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter size of array-");
    int n=sc.nextInt();

    int arr[]= new int [n];
    int i, j;
    for( i=0; i<n; i++){
        System.out.println("Enter "+(i+1)+ " element-");
        arr [i]= sc.nextInt();
    }
    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
     if(arr[i]>arr[j]){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     }}
    }
    for(i=0; i<n; i++)
    System.out.print(" "+arr[i]);

    System.out.println("\n Enter sum- ");
    int sum = sc.nextInt();

    for(i=0; i<n-1; i++){
        num=arr[i]+arr[i+1];
        if(num==sum){
            System.out.println("find sum-");
        }
        else{
        
            num-=arr[i];
            System.out.println("not found.");
        }
    }

        
        
    

    }
}*/

class Array{
    public static void main(String[]args){
int a [] = {5, 5, 4, 6, 4, 1, 7};
int s =15;

    for(int i=0; i<a.length ; i++){
    int sum =0;
    for(int j=i; j<a.length; j++){
        System.out.print(a[j]+" ");
        sum = sum + a[j];
        
        if(s == sum){
            System.out.println( "\n"+i+" : "+j);
        }
        if(sum> s)
        break;

         }

}
    }
}