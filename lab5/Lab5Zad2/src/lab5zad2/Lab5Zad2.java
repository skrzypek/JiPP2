package lab5zad2;


public class Lab5Zad2 {


    public static void main(String[] args) throws InterruptedException {
        MojLicznik ml = new MojLicznik(0);
        
        Thread thread1 = new Thread(new WatekZwiekszajacyLicznik(ml));
        Thread thread2 = new Thread(new WatekZwiekszajacyLicznik(ml));
        
        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        
        System.out.println("Wartość licznika: " + ml.counter);
    }
    
}
