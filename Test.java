package tpsit.racecondition;


public class Test {
    
    public static void main(String[] args) throws InterruptedException {
        
        Contatore.CONTEGGIO = 0;                //conteggio iniziale
        Contatore.VOLTE_CONTEGGIO = 100000;      //volte da incrementare/decrementare
        
        Thread increm = new Contatore(true, "Incrementatore");
        Thread decrem = new Contatore(false, "Decrementatore");
        
        System.out.println("Conteggio iniziale: " + Contatore.CONTEGGIO);
        
        decrem.start();
        increm.start();
        
        try{
            decrem.join();
            increm.join();
        }catch(Exception e){}
        
        System.out.println("Conteggio finale: " + Contatore.CONTEGGIO);

    }
}
