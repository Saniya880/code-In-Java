//Sort the array of 0s , 1s and 2s.
class Sort{

    private int a[];

    public void sortArray(int n[]){
            a = n;

        for(int i=0; i<=a.length; i++){
        for(int j=i+1; j<a.length; j++){
        if(a[i] == 1 && a[j] == 0){
                a[i] = a[i] + a[j];             //sorting
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
            }
            if(a[i]==2 && a[j] == 1){
                 a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
        }}}
                                 
    }
        public void display(){
        for(int element : a){
         System.out.println(element);

    }}

}
class Array{
    public static void main(String[]args){
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 0, 0, 1, 2, 2};
        Sort obj = new Sort();
        obj.sortArray(arr);
        obj.display();
    }
}


/*class Array{
    public static void main(String[]args){
        int a[]= {0, 1, 1, 0, 1, 2, 2, 0, 0, 1, 2, 2};
        int temp=0;
        for (int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
            if(a[i] == 1 && a[j] == 0){
               temp=  a[i];
                a[i]= a[j];
                a[j] = temp;
            }
            if(a[i]==2 && a[j] == 1){
                temp=  a[i];
                a[i]= a[j];
                a[j] = temp;
            }
        }}
        for(int element : a){
            System.out.println(element);
        }
    }
}*/
class Main{
    public static void main(String[]args){
        int arr[] = {1,1, 0, 0, 1,0, 2, 2, 2, 1, 0, };
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
                if(arr[i]==ar[j+1])
                continue;
                if(arr[i]> arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1]= arr[i];
                }
            }
            
        }
    }
}