// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: MGaris.java
// Deskripsi: Membuat main kelas garis untuk pengaplikasiannya

public class MGaris {
    public static void main(String[] args) {
        operasiGaris OG = new operasiGaris();
        Garis g1;
        Garis g2;
        Garis g3;

        Titik t1;
        Titik t2;

        t1 = new Titik(1,2);
        t2 = new Titik(3,4);

        g1 = new Garis();
        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);

        g2 = new Garis(new Titik(8,5), new Titik(6,9));

        System.out.println("Garis G1 = (" + g1.getAbsisTitik(g1.getTitikAwal()) + ", " + g1.getOrdinatTitik(g1.getTitikAwal()) + "), (" + g1.getAbsisTitik(g1.getTitikAkhir()) + ", " + g1.getOrdinatTitik(g1.getTitikAkhir()) + ")");
        System.out.println("Garis G2 = (" + g2.getAbsisTitik(g2.getTitikAwal()) + ", " + g2.getOrdinatTitik(g2.getTitikAwal()) + "), (" + g2.getAbsisTitik(g2.getTitikAkhir()) + ", " + g2.getOrdinatTitik(g2.getTitikAkhir()) + ")");
        
        System.out.println("Mengeset nilai titik awal dari garis G2 menjadi (3, 3)");
        g2.setTitikAwal(new Titik(3,3));
        System.out.println("Garis G2 = (" + g2.getAbsisTitik(g2.getTitikAwal()) + ", " + g2.getOrdinatTitik(g2.getTitikAwal()) + "), (" + g2.getAbsisTitik(g2.getTitikAkhir()) + ", " + g2.getOrdinatTitik(g2.getTitikAkhir()) + ")");
        
        System.out.println("Mengeset nilai absis titik awal garis G2 menjadi 5");
        g2.setAbsisTitik(g2.getTitikAwal(), 5);
        System.out.println("Garis G2 = (" + g2.getAbsisTitik(g2.getTitikAwal()) + ", " + g2.getOrdinatTitik(g2.getTitikAwal()) + "), (" + g2.getAbsisTitik(g2.getTitikAkhir()) + ", " + g2.getOrdinatTitik(g2.getTitikAkhir()) + ")");
        
        System.out.println("Panjang dari garis G1 adalah " + OG.getPanjang(g1));
        System.out.println("Panjang dari garis G2 adalah " + OG.getPanjang(g2));
        
        System.out.println("Gradien dari garis G1 adalah " + OG.getGradien(g1));
        System.out.println("Gradien dari garis G2 adalah " + OG.getGradien(g2));
        
        System.out.println("Merefleksikan garis G2 ke sumbu Y dan menyimpan nilainya ke garis G3");
        g3 = OG.getRefleksiY(g2);
        System.out.println("Garis G3 = (" + g3.getAbsisTitik(g3.getTitikAwal()) + ", " + g3.getOrdinatTitik(g3.getTitikAwal()) + "), (" + g3.getAbsisTitik(g3.getTitikAkhir()) + ", " + g3.getOrdinatTitik(g3.getTitikAkhir()) + ")");
    
        System.out.printf("Cek apakah garis G1 dan G2 tegak lurus?: %s\n", OG.isTegakLurus(g1, g2));
        System.out.printf("Cek apakah garis G2 dan G3 tegak lurus?: %s\n", OG.isTegakLurus(g2, g3));
        System.out.printf("Cek apakah garis G1 dan G3 tegak lurus?: %s\n", OG.isTegakLurus(g1, g3));
    }
}
