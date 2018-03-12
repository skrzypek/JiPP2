package lab5zad2;


public class WatekZwiekszajacyLicznik implements Runnable {

    MojLicznik counter;

    public WatekZwiekszajacyLicznik(MojLicznik counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized(counter){
            for (int i = 0; i < 10000; i++) {
                counter.counter++;
                // counter.increment();
            }
        }
    }
}
