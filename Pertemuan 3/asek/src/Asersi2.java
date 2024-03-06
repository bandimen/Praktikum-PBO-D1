//Nama      : Fendi Ardianto
//NIM       : 24060122130077
//Lab       : D1

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 1;
        assert(jariJari>0): "jari-jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/*
Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
Jawab:
    Asersi akan mengizinkan program untuk melanjutkan prosesnya jika kondisi di dalam asersi itu bernilai True, jika salah maka akan mengeluarkan pesan yang ada di dalamnya.
    Pada kondisi tsb, pesan yang dikeluarkan asersi harusnya "jari-jari tidak boleh kurang dari sama dengan nol"
*/
