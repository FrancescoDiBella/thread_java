package Thread123;

public class Main {
    
    public static void main(String[] args){
        MyThread T1 = new Thread1("T1");
        MyThread T2 = new Thread2("T2");
        MyThread T3 = new Thread3("T3");

        T1.start();
        T2.start();
        T3.start();

        try{
            T1.join();
            T2.join();
            T3.join();
        }catch(InterruptedException e){}
    }
}
