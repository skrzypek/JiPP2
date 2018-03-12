package lab5zad3;


public class Lambda implements Runnable {
    Delta delta;
            
    public Lambda(Delta delta){
        this.delta = delta;
    }
    
    @Override
    public void run() {
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        this.delta.calculateDelta();
    }
}
