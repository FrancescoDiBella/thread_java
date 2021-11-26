package Thread123;

public class Thread3 extends MyThread {
    public Thread3(String str){
        super(str, 2);
    }

    @Override
    public void run(){
        synchronized(this){
            while(true){
                synchronized(mem){
                    mem.notifyAll();
                    System.out.println(this.threadInterspace + "Sono il thread " + this.threadName + " entro in azione");
                }
                
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){}
            }
        }

    }
}
