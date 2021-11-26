package TiroAllaFune_Thread;

import java.util.Random;

public abstract class Player implements Runnable {
    boolean playing;
    String playerId;
    ScoreBoard scoreBoard;

    Player Opponent;

    public Player(String string, ScoreBoard scBoard){
        this.playerId = string;
        this.scoreBoard = scBoard;
    }

    public void setOpponent(Player player){
        this.Opponent = player;
    }

    @Override
    public void run(){
        this.playing = true;

        Random random = new Random();

        while(playing){
            int recover = random.nextInt(4);
            //int force = random.nextInt(6);
            
            try{ 
                Thread.sleep(recover*1000);
            }catch(InterruptedException exception){
                System.out.println("Can't sleep");
            }

            if(didOpponentWin()){
                markDefeat();
                scoreBoard.resetPosition();
                notify();
            }else{
                applyForce();
                if(didIWin()){
                    
                }
            }

        }
    }

    public abstract boolean didOpponentWin();
    public abstract boolean markVictory();
    public abstract void markDefeat();
    public abstract boolean didIWin();
    public abstract void applyForce();
}
