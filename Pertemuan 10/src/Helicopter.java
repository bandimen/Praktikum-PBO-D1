/*
 * Nama     : Fendi Ardianto
 * NIM      : 24060122130077
 * Lab      : PBO D1
 */

public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(){

    }
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
