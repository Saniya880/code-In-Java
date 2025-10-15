class Array{
    public static void main(String[]args){
    int a[][]={{10, 20, 30},{40, 50, 60},{70, 80, 90}}; //r1 60     //r2 150        r3 270

    int sum=0, row_sum=0;

    for(int r=0; r<1; r++){
        for(int c=0; c<1; c++){
            row_sum+=a[r][c];
            if(sum<row_sum){
            sum=row_sum;}
        }
        System.out.println("Maximum sum of the row is- "+sum);
    }
        
    
    }
}