// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: operasiGaris.java
// Deskripsi: Membuat method tambahan dari kelas Titik

public class operasiTitik {
    public double getJarakPusat(Titik t){
        return Math.sqrt(Math.pow(t.getAbsis(), 2) + Math.pow(t.getOrdinat(), 2));
    }

    public void refleksiX(Titik t){
        t.setOrdinat(t.getOrdinat()*(-1));
    }
    
    public void refleksiY(Titik t){
        t.setAbsis(t.getAbsis()*(-1));
    }

    public Titik getRefleksiX(Titik t){
        Titik ti = new Titik(t.getAbsis(), t.getOrdinat());
        refleksiX(ti);
        return ti;
    }

    public Titik getRefleksiY(Titik t){
        Titik ti = new Titik(t.getAbsis(), t.getOrdinat());
        refleksiY(ti);
        return ti;    
    }
}
