package Zadanie17;

public class Punkt {
    int x , y ;
    Punkt ( ) {
        x = 1 ;
        y = 1 ;
    }
    Punkt ( int wspX , int wspY ) {
        x = wspX ;
        y = wspY ;
    }
    Punkt ( Punkt A) {
        x = A.x ;
        y = A.y ;
    }
    int pobierzX ( ) {
        return x ;
    }
    int pobierzY ( ) {
        return y ;
    }
    void wyswietl ( ) {
        System.out.println( " x = " + x + " , y = " + y ) ;
    }
}
