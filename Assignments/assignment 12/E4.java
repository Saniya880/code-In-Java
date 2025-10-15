/*4. NullPointerException

👉 Declare a String = null. Try to call length() on it. Handle the exception.

// Expected
java.lang.NullPointerException caught*/
class TestMain{
    public static void main(String[]args){
        String name = null;
        try{
        int  length = name.length();
        System.out.println(length);
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Execution succesfully...");
        }

    }
}
