/**
 * File : Segitiga.java 13/03/2024
 * Penulis : Fendi Ardianto (24060122130077)
 * Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
 */


package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public void printInfo(){
        System.out.println("Spek Segitiga :");
        System.out.println("Sisi :" +this.getJumlahSisi());
        System.out.println("Alas : "+getAlas());
        System.out.println("Tinggi : "+getTinggi());
    }
}