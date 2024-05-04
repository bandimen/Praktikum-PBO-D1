/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(){

    }
    public Programmer(String nama){
        super(nama);
    }
    public int getBonus(){
        return this.bonus;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
