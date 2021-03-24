package tpsit.racecondition;


public class Test {
    
    public static void main(String[] args) throws InterruptedException {
        
        Contatore.CONTEGGIO = 0; 
        Contatore.VOLTE_CONTEGGIO = 1000;
        Contatore.SLEEP_TIME = 0;
        
        Thread increm = new Contatore(true, "Incrementatore");
        Thread decrem = new Contatore(false, "Decrementatore");
        
        System.out.println("Conteggio iniziale: " + Contatore.CONTEGGIO);
        
        increm.start();
        decrem.start();
        
        increm.join();
        decrem.join();
        
        System.out.println("Conteggio finale: " + Contatore.CONTEGGIO);

    }
}
