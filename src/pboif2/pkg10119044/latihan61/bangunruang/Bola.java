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

public class Bola extends BangunRuang {
    
    private double phi = 3.14;
    private final int r;

    public Bola(double phi, int r){
        this.phi = phi;
        this.r = r;
    }
    
    public double getPhi(){
        return phi;
    }
    
    public double getR(){
        return r;
    }
    
    @Override
    public void hitungVolume() {
         double volume;
         volume = ((4 * getPhi() * Math.pow(r, 3))/3);
         System.out.println("Hasil: V = "+Math.ceil(volume)+" cm^3");
    }
}
