//Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
class Array{
    
    public void unsortedArray(){

        for(int i=0; i<a.length ; i++){
            if( a[i] > 0)
             a1 [i] = a[i];
            else{
                a2[i] = a[i];
            }
        }
    }

    public static void main(String[]args){
        int a[] = {1, -1, 3, 2, -7, -5, 11, 6};

        int a1[] = new int[a.length];
        int a2[] = new int [a.length];
        unsortedArray();

        for(int i=0; i<a.length; i++){
        System.out.println(a1[i]+" ");
        System.out.println(a2[i]+" ");}

    }
}
