//Find occurance of an integer number in array.
class Main{
    public static void main(String[]args){
    int arr[] = {1, 2, 2, 2, 3, 4, 4, 5, 6};
    int n = arr.length;
    boolean b[] = new boolean[n];


    for(int i=0; i<n; i++){
        int count =1; 
        if(b[i])
        continue;
        for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                count++;
                b[j] = true;
            }
        }System.out.println(arr[i]+" occur at "+count+" times.");
    }



    }}     