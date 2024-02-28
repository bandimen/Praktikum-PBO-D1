// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: operasiGaris.java
// Deskripsi: Membuat method tambahan dari kelas Garis

public class operasiGaris {
    public double getPanjang(Garis g){
        double x1 = g.getAbsisTitik(g.getTitikAwal());
        double x2 = g.getAbsisTitik(g.getTitikAkhir());
        double y1 = g.getOrdinatTitik(g.getTitikAwal());
        double y2 = g.getOrdinatTitik(g.getTitikAkhir());
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double getGradien(Garis g){
        double x1 = g.getAbsisTitik(g.getTitikAwal());
        double x2 = g.getAbsisTitik(g.getTitikAkhir());
        double y1 = g.getOrdinatTitik(g.getTitikAwal());
        double y2 = g.getOrdinatTitik(g.getTitikAkhir());
        return (y2 - y1) / (x2 - x1);
    }

    public Garis getRefleksiY(Garis g){
        Titik t1 = new Titik(g.getAbsisTitik(g.getTitikAwal())*-1, g.getOrdinatTitik(g.getTitikAwal()));
        Titik t2 = new Titik(g.getAbsisTitik(g.getTitikAkhir())*-1, g.getOrdinatTitik(g.getTitikAkhir()));
        return new Garis(t1, t2);
    }

    public boolean isTegakLurus(Garis g1, Garis g2){
        return getGradien(g1) * getGradien(g2) == -1;
    }
}   
