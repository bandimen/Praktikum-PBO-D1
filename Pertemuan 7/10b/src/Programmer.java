/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(){

    }
    public Programmer(String nama){
        super(nama);
        this.bonus = 450000;
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
