//Write a program to cyclically rotate array by one.
class Array{

    public void rotate(int a[]){
         int temp =0;
        for(int i=0; i<a.length;i++){
            temp = a[a.length-1];
            a[a.length-1] = a[i];
            a[i] = temp;}
    }

    public static void main(String[]args){
        int arr[] = {2, 5, 4, 6, 3};
         int temp =0;
        for(int i=0; i<a.length;i++){
            temp = a[a.length-1];
            a[a.length-1] = a[i];
            a[i] = temp;}

        
        for(int i=0; i<a.length; i++)
        System.out.println(a[i]+" ");
    }
}