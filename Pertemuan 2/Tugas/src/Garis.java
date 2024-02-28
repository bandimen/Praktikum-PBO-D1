// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Garis.java
// Deskripsi: Membuat kelas garis beserta method dasar


public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;

    // Method
    Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    Garis(Titik a, Titik b){
        titikAwal = a;
        titikAkhir = b;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getAbsisTitik(Titik a){
        return a.getAbsis();
    }

    public double getOrdinatTitik(Titik a){
        return a.getOrdinat();
    }

    public void setTitikAwal(Titik a){
        this.titikAwal = a;
    }

    public void setTitikAkhir(Titik b){
        this.titikAkhir = b;
    }

    public void setAbsisTitik(Titik a, double absis){
        a.setAbsis(absis);
    }

    public void setOrdinatTitik(Titik a, double ordinat){
        a.setOrdinat(ordinat);
    }

}
