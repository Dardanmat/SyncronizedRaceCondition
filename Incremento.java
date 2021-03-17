package tpsit.racecondition;
import java.util.Random;


public class Incremento extends Thread{

    public Incremento(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Numero.volte; i++) {
            Numero.num++;
            sleepLess1Second();
        }
    }
    
    public void sleepLess1Second(){
        try {
            sleep(new Random().nextInt(Numero.sleepTime));
        } catch (Exception e) {}
    }
    
}
