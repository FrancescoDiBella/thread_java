package TiroAllaFune_Thread;

public class ScoreBoard {
    int[] vittorie;
    int posizione;

    public ScoreBoard(){
        this.vittorie = new int[2];
        this.posizione = 0;
    }

    public synchronized void markVictory(int player){
        this.vittorie[player] +=1;
    }

    public synchronized void movePosizione(int offset){
        this.posizione += offset;
    }

    public synchronized int getVittorie(int player){
        return this.vittorie[player];
    }

    public synchronized int getPosition(){
        return this.posizione;
    }

    public synchronized void resetPosition(){
        this.posizione = 0;
    }

}
