/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil perhitungan volume bangun ruang
 */

public class PBOIF210119044Latihan61BangunRuang {
    public static void main(String[] args) {
        Bola bola = new Bola(3.14, 7);
        bola.hitungVolume();
        
        Tabung tabung = new Tabung(3.14, 21, 10);
        tabung.hitungVolume();
        
        Kerucut kerucut = new Kerucut(3.14, 9, 14);
        kerucut.hitungVolume();
    }
}
