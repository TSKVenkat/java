class hellothread extends Thread{
    @Override
    public void run(){
        try{
            while(!Thread.interrupted()){
                System.out.println("Hello!");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class WelcomeThread extends Thread{
    @Override

    public void run(){
        try{
            while(!Thread.interrupted()){
                System.out.println("Welcome!");
                Thread.sleep(3000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class thread{
    public static void main(String[] args){
        hellothread t1 = new hellothread();
        WelcomeThread t2 = new WelcomeThread();
        t1.start();
        t2.start();
         try{
            Thread.sleep(10000);
            t1.interrupt();
            t2.interrupt();
            t1.join();
            t2.join();
            System.out.println("All done!");
         }catch(Exception e){
            e.printStackTrace();
         }
    }
}