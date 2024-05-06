/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Pegawai {
    private String nama;
    private int gajiPokok;

    public Pegawai(){

    }
    public Pegawai(String nama){
        this.nama = nama;
        this.gajiPokok = 5000000;

    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getGajiPokok(){
        return this.gajiPokok;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void tampilData(){
        System.out.printf("Nama : %s, Gaji pokok : %d\n", this.nama, this.gajiPokok);
    }
}
