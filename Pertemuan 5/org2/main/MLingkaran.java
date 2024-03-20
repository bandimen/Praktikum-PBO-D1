package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}

/*
Praktekkan  : Buatlah MLingkaran sedemikian hingga dapat menerima input jejari dari pengguna !
Jawab       : Untuk membuat MLingkaran dapat menerima input jejari dari pengguna, kita dapat menggunakan tools dari java bernama Scanner untuk menginput.
              mengggunakan nextDouble() untuk membaca input pengguna dengan tipe data double, lalu hasilnya akan disimpan ke variabel jejari.
 */