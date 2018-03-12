package lab4zad4;

import java.util.HashMap;
import java.util.Map;


public class Lab4Zad4 {


    public static void main(String[] args) {
        Map<String, Pracownik> pracownicy = new HashMap<>();
        
        Pracownik pracownik = new Pracownik(22, "M");
        pracownicy.put("pracownikRoku", pracownik);
        
        System.err.println("Gender: " + pracownicy.get("pracownikRoku").getGender());
        System.err.println("Age: " + pracownicy.get("pracownikRoku").getAge());
    }
    
}
