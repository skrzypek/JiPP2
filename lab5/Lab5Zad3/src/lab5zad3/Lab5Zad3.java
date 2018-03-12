package lab5zad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lab5Zad3 {


    public static void main(String[] args) throws IOException, InterruptedException {
        double a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0.");
        System.out.printf("Podaj a. ");
        
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a.");
        } else {
            System.out.printf("Podaj b. ");
            b = Double.parseDouble(br.readLine());
            System.out.printf("Podaj c. ");
            c = Double.parseDouble(br.readLine());
            
            Delta delta = new Delta(a, b, c);

            Thread thread = new Thread(new Lambda(delta));
            thread.start();
            Thread.sleep(100);

            System.out.printf("Dla a = " + "%4.2f,", a);
            System.out.printf(" b = " + "%4.2f,", b);
            System.out.printf(" c = " + "%4.2f\n", c);
            if (delta.delta < 0) {
                System.out.println("Brak pierwiastków rzeczywistych.");
            } else if (delta.delta == 0) {
                System.out.print("trójmian ma jeden pierwiastek podwójny ");
                System.out.print("x1 = ");
                System.out.printf("%4.2f.", delta.x());
            } else if (delta.delta > 0) {
                System.out.print("x1 = ");
                System.out.printf("%4.2f,", delta.x1());

                System.out.print(" x2 = ");
                System.out.printf("%4.2f.\n", delta.x2());
            }
            thread.interrupt();
        }
    }
}