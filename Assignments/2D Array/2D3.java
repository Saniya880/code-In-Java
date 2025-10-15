class Array{
    public static void main(String[]args){
        int a[][]= {{10, 20, 30},
                     {40, 50, 60},
                     {70, 80, 90}};
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                if (r>c)
                System.out.println(a[r][c]);
            }
        }
        
    
    }
}