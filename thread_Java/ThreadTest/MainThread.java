package ThreadTest;
class MainThread{
    public static void main(String argv[]) throws InterruptedException{

        Thread t1 = new Thread(new HelloThreadR());
        Thread t2 = new Thread(new HelloThread());
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main Thread finished");
    }
}