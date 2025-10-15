//Write a java program to impelment binary search algorithm
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of element");
        int n = sc.nextInt();
        int a[] = new int [n];

        System.out.println("Enter elements in array");
        for(int i=0; i<n; i++)
         a [i] = sc.nextInt();

         for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
                }
            }}
            int low = 0, high=a.length-1;
            boolean found = false;

            System.out.println("Enter element to find");
            int element = sc.nextInt();

            while(low<=high){
                int mid=(low+high)/2;

                if(a[mid] == element){
               System.out.println(element+" (Element) found at "+(mid+1)+" position.");
                found = true;
                break;}

                if(element < a[mid]){
                    high = mid -1; ;
                }
                
                if(element > a[mid]){
                    low = mid +1;
                }  
                
            } 
            if(!found)
            System.out.println("Element not found.");
    }
}