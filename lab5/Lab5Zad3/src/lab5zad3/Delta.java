package lab5zad3;


public class Delta {
    public double a; 
    public double b;
    public double c;
    public double delta;
    
    public Delta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public synchronized double calculateDelta(){
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
        return this.delta;
    }
    
    public double x(){
        return -this.b / (2 * this.a);
    }
    
    public double x1(){
        return (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
    }
    
    public double x2(){
        return (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
    }
}
