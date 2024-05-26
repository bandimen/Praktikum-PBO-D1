/*
 * Nama     : Fendi Ardianto
 * NIM      : 24060122130077
 * Lab      : PBO D1
 */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(){

    }
    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
