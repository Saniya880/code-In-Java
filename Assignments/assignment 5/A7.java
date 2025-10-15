// WAP to search an element in array using binary search.
import java.util.Scanner;
class Array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of array.");
        int n = sc.nextInt();

        int a[] = new int [n];
        int i,j,temp;

        for( i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(a[i]>a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
                }
            }
        }
       // int a[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 10};

         System.out.println("ENter element-");
        int element=sc.nextInt();

        
        int low=0, high=n-1, mid;
        boolean found=false;

       
        while(low<=high){
            mid=(low + high) / 2;

            if(a[mid]==element){
            System.out.println("Element "+a[mid]+" found at index- "+mid);
            found=true;
            break;}
            else if(element>a[mid]){
                low=mid+1;}
            else{
                high=mid-1;
            }
            }
            if (!found)
            System.out.println("Element not found");
            
        }
    }
