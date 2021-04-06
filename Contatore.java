package tpsit.racecondition;

public class Contatore extends Thread{
    
    public static int CONTEGGIO = 0;
    public static int VOLTE_CONTEGGIO = 0;
    
    public boolean incrementa;

    public Contatore(boolean incrementa, String name) {
        super(name);
        this.incrementa = incrementa;
    }

    @Override
    public void run() {
        conta(incrementa);
    }
    
    public synchronized static void conta(boolean incrementa){
        if(incrementa) incremento();
        else decremento();
    }
    
    private static void incremento(){
        for(int i = 0; i < VOLTE_CONTEGGIO; i++){
                CONTEGGIO ++;
            }
    }
    
    private static void decremento(){
        for(int i = 0; i < VOLTE_CONTEGGIO; i++){
                CONTEGGIO --;
            }
    }
}
