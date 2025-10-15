class CreateThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++)
        {
            System.out.println(i);
        }
    }
}
class CreateThreadSecond extends Thread{
    public void run(){
        for(int i=65; i<=69; i++){
            System.out.println(" "+(char)i);
        }
    }
}
class TestMain{
    public static void main(String[]args){

        CreateThread t1 = new CreateThread();
        CreateThreadSecond t2 = new CreateThreadSecond();

        t1.start();
        t2.start();
    }
}