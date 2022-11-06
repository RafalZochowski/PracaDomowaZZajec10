package Zadanie18_19;

public class Potomna extends Bazowa{
    int liczba=1;

    public int pobierzWartosc (boolean x){
        if (x == true){
            return liczba;
        } else {
            return super.liczba;
        }
    }

    public void ustawWartosc (int x, boolean czyTrue){
        if (czyTrue == true){
            this.liczba = x;
        } else {
            super.liczba= x;
        }
    }
}
