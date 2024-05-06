/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(){

    }
    public Manajer(String nama){
        super(nama);
        this.tunjangan = 700000;
    }
    public int getTunjangan(){
        return this.tunjangan;
    }
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
