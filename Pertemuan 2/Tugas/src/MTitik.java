// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: MTitik.java
// Deskripsi: Membuat main kelas titik untuk pengaplikasiannya

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        Titik t5;
        operasiTitik OT = new operasiTitik();

        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        
        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        
        t3 = new Titik(5, 6);
        
        System.out.println("Jumlah objek titik : " + t2.getCounter());
        System.out.println("T1 = (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("T2 = (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("T3 = (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        
        System.out.println("Jarak titik T2 ke titik pusat adalah " + OT.getJarakPusat(t2));

        System.out.println("Merefleksikan Titik T3 ke sumbu X");
        OT.refleksiX(t3);
        System.out.println("T3 = (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        
        System.out.println("Merefleksikan Titik T3 ke sumbu Y");
        OT.refleksiY(t3);
        System.out.println("T3 = (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        
        System.out.println("Merefleksikan Titik T1 ke sumbu X lalu menyimpan hasilnya di T4");
        t4 = OT.getRefleksiX(t1);
        System.out.println("T4 = (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        
        System.out.println("Merefleksikan Titik T1 ke sumbu Y lalu menyimpan hasilnya di T5");
        t5 = OT.getRefleksiY(t1);
        System.out.println("T5 = (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");
    }
}
