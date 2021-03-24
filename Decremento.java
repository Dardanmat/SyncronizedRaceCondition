package tpsit.racecondition;
import java.util.Random;


public class Decremento extends Thread{

    public Decremento(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Test.volte; i++) {
            Test.num--;
            sleepLess1Second();
        }
    }
    
    public void sleepLess1Second(){
        try {
            sleep(new Random().nextInt(Test.sleepTime));
        } catch (Exception e) {}
    }
    
}
