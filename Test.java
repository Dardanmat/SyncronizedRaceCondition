package tpsit.racecondition;


public class Test {
    
    public static void main(String[] args) throws InterruptedException {
        
        Contatore.CONTEGGIO = 0; //conteggio iniziale
        Contatore.VOLTE_CONTEGGIO = 1000; //volte da incrementare/decrementare
        Contatore.SLEEP_TIME = 10; //#sleepTime
        
        Thread increm = new Contatore(true, "Incrementatore");
        Thread decrem = new Contatore(false, "Decrementatore");
        
        System.out.println("Conteggio iniziale: " + Contatore.CONTEGGIO);
        
        decrem.start();
        increm.start();
        
        decrem.join();
        increm.join();
        
        System.out.println("Conteggio finale: " + Contatore.CONTEGGIO);

    }
}
