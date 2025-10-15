//Write a Java program to find the largest and smallest element of an array.
import java.util.Scanner;
class FindElements{
    private int n;
     private int a[];

    public  void inputElements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
         this.n= sc.nextInt();
         this.a = new int [n];

        System.out.println("Enter elements in array");
        for(int i=0; i<n; i++)
        this.a[i] = sc.nextInt();
    }
    public void setData(){
        this.n = n;
        this.a = a;
    }
    public  void compareElement(){
       /* for(int i=0; i<n-1; i++){                 //1. by sorting array
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                  }  }}
            for(int i=0; i<n; i++)
            System.out.print(" "+a[i]); //after sorting
          System.out.println("\nSmallest element in an array is "+a[0]+"  \nLargest element in an array is "+a[a.length-1]);*/
          int max=a[0];
          int min=a[0];
          for(int i=0; i<n; i++){
            if(max < a[i])
                max = a[i];
            else if ( min > a[i])
                min=a[i];
            }
            System.out.println("Smallest number= "+min+" \nLargest number = "+max);
          }
        }

class Main{
    public static void main(String []args){
        FindElements obj = new FindElements();
        obj.inputElements();
        obj.compareElement();
    }
}