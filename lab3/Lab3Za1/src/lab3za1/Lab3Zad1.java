package lab3za1;


public class Lab3Zad1 {

    public static void main(String[] args) {
        Stol stol = new Stol();
        System.err.println("Stół:");
        System.err.println(Mebel.kwalifikacjaPojazdu(stol));
        
        Szafa szafa = new Szafa();
        System.err.println("Szafa:");
        System.err.println(Mebel.kwalifikacjaPojazdu(szafa));
    }   
}