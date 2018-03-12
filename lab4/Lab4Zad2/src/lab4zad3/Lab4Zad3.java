package lab4zad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Lab4Zad3 {


    public static void main(String[] args) {
        List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        
        Pracownik pracownik0 = new Pracownik(0);
        Pracownik pracownik1 = new Pracownik(1);
        listaPracownikow.add(pracownik0);
        listaPracownikow.add(pracownik1);

        // Przykład 1
        System.out.println("Przykład 1");
        Iterator<Pracownik> iter1 = listaPracownikow.iterator();
        while (iter1.hasNext()) {
            Pracownik p = iter1.next();
            System.out.print("Pracownik = ");
            System.out.println(p.getId());
        }    
        
        // Przykład 2
        System.out.println("\nPrzykład 2");
        Iterator iter2 = listaPracownikow.iterator();
        while (iter2.hasNext()) {
            Pracownik p = (Pracownik)iter2.next();
            System.out.print("Pracownik = ");
            System.out.println(p.getId());
        }    
    }
}
