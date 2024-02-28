// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Titik.java
// Deskripsi: Membuat kelas titik beserta method dasar

public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    static int counter;

    // Method
    Titik (){
        counter++;
        absis = 0;
        ordinat = 0;
    }

    Titik (double a, double b){
        counter++;
        absis = a;
        ordinat = b;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }

    public int getCounter(){
        return counter;
    }

}