package Thread123;

public class SharedMem {
    public static int m = 0;

    public int getM(){
        return m;
    }

    public void setRandomM(){
        m = ((int)(Math.random() * 1000));
    }

}
