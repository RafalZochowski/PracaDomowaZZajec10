import Zad20.Taxi;
import Zadanie18_19.Potomna;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean x = true;
        Potomna potomkin = new Potomna();

        System.out.println(potomkin.pobierzWartosc(x));
        potomkin.ustawWartosc(20,x);



        Taxi janusza = new Taxi();
        System.out.println(janusza.srPrzebieg());
        System.out.println(janusza.srZarobki());

        System.out.println();
    }
}