/**
 * File : MPoligon.java 13/03/2024
 * Penulis : Fendi Ardianto (24060122130077)
 * Deskripsi : realisasi file Poligon, Segitiga, dan persegiPanjang
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());

        System.out.println("------------------------------------");

        Segitiga segitiga = new Segitiga(5, 3, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}