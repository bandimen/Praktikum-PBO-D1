/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(){

    }
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public void menembak(){
        if(getPeluru()>0){
            System.out.println(getBunyi());
            setPeluru(getPeluru()-1);
            System.out.println("Sisa Peluru: " + getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }

}
