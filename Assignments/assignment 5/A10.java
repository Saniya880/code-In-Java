//WAP to to count the occurance of all element in array
import java.util.Scanner;
class Array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        int a[]= {2, 3,3, 4, 5, 6, 8,4, 5};
        boolean flag []= new boolean [a.length];


        for(int i=0; i<a.length; i++){
            int count=1;
            if (flag[i])
            continue;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                count++;
                flag[j]=true;
                }
            }
        System.out.println("Element "+a[i]+ " found " +count + " times.");
        }
    }
}