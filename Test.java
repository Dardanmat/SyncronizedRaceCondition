package tpsit.racecondition;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        
        Thread increm = new Incremento("Incrementatore");
        Thread decrem = new Decremento("Decrementatore");

        increm.start();
        decrem.start();
        
        increm.join();
        decrem.join();
        
        System.out.println("Numero " + Numero.num);

    }
}
