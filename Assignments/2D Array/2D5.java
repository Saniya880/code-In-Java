class Array{
    public static void main(String[]args){
     int a[][]= {{10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}};
            
            int e_sum=0, o_sum=0;
    for(int r=0; r<3; r++){
        for(int c=0; c<3; c++){
            if(a[r][c]%2==0)
            e_sum= e_sum+a[r][c];
            else
            o_sum= o_sum+a[r][c];  
        }
    }
    System.out.println(" Sum of even element = "+e_sum);
    System.out.println("Sum of odd element =  "+o_sum);
    }
}