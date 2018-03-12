package lab1zad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;


public class Lab1Zad2 {
       
    public static void main(String[] args) throws IOException {
        double a, b, c, delta;
        int liczba_pierwiastkow = 0;
        
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

            File ff = new File();
            ff.saveToFile(MessageFormat.format("{0},{1},{2}", a, b, c));
            String[] strArray = ff.readDataFromFile().split(",");

            a = Double.parseDouble(strArray[0]);
            b = Double.parseDouble(strArray[1]);
            c = Double.parseDouble(strArray[2]);

            delta = (b*b)-(4*a*c);
            System.err.println("Delta: " + delta);

            if (delta < 0) {
                liczba_pierwiastkow = 0;
            } else if (delta == 0) {
                liczba_pierwiastkow = 1;
            } else if (delta > 0) {
                liczba_pierwiastkow = 2;
            }
            System.out.printf("Dla a = " + "%4.2f,", a);
            System.out.printf(" b = " + "%4.2f,", b);
            System.out.printf(" c = " + "%4.2f\n", c);
            switch (liczba_pierwiastkow) {
               case 0 : {
                   System.out.println("Brak pierwiastków rzeczywistych.");
                   break;
               }
               case 1 : {
                   System.out.print("trójmian ma jeden pierwiastek podwójny ");
                   System.out.print("x1 = ");
                   System.out.printf("%4.2f.", -b/(2*a));
                   break;
               }
               case 2 : {
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f,", (-b-Math.sqrt(delta))/(2*a));

                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f.\n", (-b+Math.sqrt(delta))/(2*a));
                    break;
               }
            }
        }
    }    
}