package tpsit.racecondition;
import java.util.Random;

public class Contatore extends Thread{
    
    public static int CONTEGGIO = 0;
    public static int VOLTE_CONTEGGIO = 0;
    public static int SLEEP_TIME = 0;
    
    public boolean incrementa;

    public Contatore(boolean incrementa, String name) {
        super(name);
        this.incrementa = incrementa;
    }

    @Override
    public void run() {
        for(int i = 0; i < VOLTE_CONTEGGIO; i++){
            try{
                if(incrementa){
                    CONTEGGIO++;
                    sleep(new Random().nextInt(SLEEP_TIME));
                }
                else CONTEGGIO--;
            }catch(Exception e){}
        }
    }
}
