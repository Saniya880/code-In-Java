/* Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
All even numbers of A from left to right are copied into C from left to right. 
All odd numbers of A from left to right are copied into C from right to left. 
All even numbers of B from left to right are copied into C from left to right. 
All old numbers of B from left to right are copied into C from right to left.
*/
class Main{
    public static void main(String[]args){
    int a [] = {3, 2, 1, 7, 6, 3};
    int b[] = {9, 3, 5, 6, 2, 8, 10};
    int c [] = new int [a.length + b.length];

    for(int i=0; i< c.length; i++){
    
        if(a[i]%2==0){
            c[]=a[i];
        }
        
    }
    }
}