package Zad20;

import java.util.Random;

public class Auto {
    float[] przebieg = new float[12];


    Random random = new Random();
    public Auto(){
        for (int i =0; i < 12; i++){
            float y = random.nextFloat(5000);
            przebieg[i] = y;
        }
    }

    public float srPrzebieg(){
        float srPrzeb=0;
        for (int i = 0; i<12; i++)
              {
            srPrzeb += przebieg[i];
        }
        return srPrzeb/12;
    }
}
