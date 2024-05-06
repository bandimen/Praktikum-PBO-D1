/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(){

    }
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
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
    public boolean isMenusuk(){
        return this.menusuk;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }


}
