package Thread123;


public abstract class MyThread extends Thread{
    static public SharedMem mem = new SharedMem();
    public String threadName;
    String threadInterspace = "";
    int M0;

    public MyThread(String str, int n){
        this.threadName = str;
        for(int i = 0; i < n * 5; i++){
            threadInterspace += "\t";
        }
    }

    private void setM0(){
        M0 = mem.getM();
    }

    private void setRandomM(){
        mem.setRandomM();
    }

    private void showM(){
        System.out.println(threadInterspace + "Sono il thread " 
                            + threadName
                            + " il valore di m è " + mem.getM());
    }

    public void func(int threadId){
        synchronized(mem){
            this.showM();
            this.setM0();
            this.setRandomM();

            try{
                Thread.sleep(300);
            }catch(InterruptedException e){}

            if(M0%2 == threadId){
                try{
                    System.out.println(threadInterspace + "Sono il thread " 
                            + threadName
                            + " e mi sto addormentando");
                    mem.wait();
                }catch(InterruptedException e){}
            }
        }
    }

}
