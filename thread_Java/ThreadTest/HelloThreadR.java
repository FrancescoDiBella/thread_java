package ThreadTest;
public class HelloThreadR implements Runnable {
    
    @Override
    public void run(){
        System.out.println("Hello Thread implementing Runnable!");
    }
}
