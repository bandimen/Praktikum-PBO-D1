/*
 * Nama : Fendi Ardianto
 * NIM  : 24060122130077
 * Lab  : D1
 */

public class KontrolSenjata extends Senjata{
    private Senjata senjata;

    public KontrolSenjata(){

    }
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        setPeluru(getPeluru() + jumPeluru);
        System.out.println("Peluru berhasil ditambah: "+jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        if(isAdaPeluru()){
            for(int i = jumlah; i > 0; i--){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    setPeluru(getPeluru() - 1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk(){
        if(isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
