package lab5zad2;


public class MojLicznik {

    public int counter;

    public MojLicznik(int counterVal) {
        this.counter = counterVal;
    }
    
    public synchronized void increment() {
        this.counter++;
    }
}
