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
    Dalam kelas lingkaran, mereka tidak mengizinkan variable jariJari untuk diakses global, sehingga harus menggunakan setter dan getter untuk mengakses nilainya.
*/