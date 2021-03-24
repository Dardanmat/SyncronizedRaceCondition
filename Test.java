package tpsit.racecondition;


public class Test {
    
    public static int num = 0;
    public static int volte = 200;
    public static int sleepTime = 100;
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread increm = new Incremento("Incrementatore");
        Thread decrem = new Decremento("Decrementatore");

        increm.start();
        decrem.start();
        
        increm.join();
        decrem.join();
        
        System.out.println("Numero " + Test.num);

    }
}
