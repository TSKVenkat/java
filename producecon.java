class Buffer{
    int value;
    boolean available = false;

    synchronized void produce(int val) throws InterruptedException{
        while(available) wait();
        value = val;
        System.out.println("Produced: " + value);
        available = true;
        notifyAll();
    }

    synchronized void consume() throws InterruptedException{
        while(!available) wait();
        System.out.println("Consumed: " + value);
        available = false;
        notifyAll();
    }
}

class Producer extends Thread{
    Buffer b;
    Producer(Buffer b){
        this.b = b;
    }
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                b.produce(i);
                Thread.sleep(100);
            }
        }catch(InterruptedException e){ Thread.currentThread().interrupt(); }
    }
}

class Consumer extends Thread{
    Buffer b;
    Consumer(Buffer b){
        this.b = b;
    }
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                b.consume();
                Thread.sleep(150);
            }
        }catch(InterruptedException e){ Thread.currentThread().interrupt(); }
    }
}

public class producecon{
    public static void main(String[] args){
        Buffer b = new Buffer();
        new Producer(b).start();
        new Consumer(b).start();
    }
}