package Thread123;

public class Thread2 extends MyThread {
    public Thread2(String str){
        super(str, 1);
    }

    @Override
    public void run(){
        while(true){
            this.func(1);
        }
    }
}
