class Test {
    public static void main (String args []){
        String s1 = "aabbddfr";
        String s2 = " ";
        for(int i = 0 ; i<s1.length();i++){
            char ch = s1.charAt(i);
            for (int j = 1 ; j < s1.length() ; j++){
                if (ch != s1.charAt(j) )
                s2 = s2 + ch ;   

            }
        }
        System.out.println("string is "+s2);
    }
}