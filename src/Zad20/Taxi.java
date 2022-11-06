package Zad20;

public class Taxi extends Auto{
    float[] zarobki = new float[12];

    public Taxi (){
        for (int i=0; i<12; i++) {
            float x = random.nextFloat(7000);
            zarobki[i] = x;
        }
    }

    public float srZarobki(){
        float srZaro=0;
        for (int i =0; i<12; i++) {
            srZaro += zarobki[i];
        }
        return srZaro/12;
    }
}
