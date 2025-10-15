class Task{
    
     synchronized public void m1(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"  Synchronized m1 is executing...");
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}}
        }
     
}
class First extends Thread {
    private Task t;

    public First(Task t){
       this.t = t;
    }
    public void run(){
        t.m1();
    }  
}
class Second extends Thread {
    private Task t;
    public Second (Task t){
       this.t = t;
    }
    public void run(){
        t.m1();
    }  
}

class TestMain{
    public static void main(String [] args){
        Task task = new Task();
        First t1 = new First(task);
        Second t2 = new Second(task);

        t1.start();
        t2.start();
        
    }
}
