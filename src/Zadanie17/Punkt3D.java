package Zadanie17;

public class Punkt3D extends Punkt{
    int z;

    public Punkt3D(){

    }
    public Punkt3D(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z =z;
    }
    public Punkt3D(Punkt A,int z){
        this.x =A.x;
        this.y = A.y;
        this.z = z;
    }
    public Punkt3D (Punkt3D A){
        this.x = A.x;
        this.y = A.y;
        this.z = A.z;
    }

    void wyswietl(){
        System.out.println(" x = " + x +" , y = " +y +" , z = " +z);
    }

    int pobierzY() {
        return y;
    }

}
