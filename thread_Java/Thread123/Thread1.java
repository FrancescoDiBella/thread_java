package Thread123;

public class Thread1 extends MyThread{
    public Thread1(String str){
        super(str, 0);
    }

    @Override
    public void run(){
        while(true){
            this.func(0);
        }
    }
}
