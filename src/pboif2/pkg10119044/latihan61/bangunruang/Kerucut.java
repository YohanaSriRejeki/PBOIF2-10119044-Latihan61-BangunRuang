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
public class Kerucut extends BangunRuang {
    private final int t;
    private final int r;
    private final double phi = 3.14;

    public Kerucut(double phi, int t, int r){
        this.t = t;
        this.r = r;
    }
    
    public double getPhi(){
        return phi;
    }
    
    public double getT(){
        return t;
    }
    
    public double getR(){
        return r;
    }
    
    @Override
    public void hitungVolume() {
         int volume;
         volume = (int)((getPhi() * Math.pow(r, 2) * t)/3);
         System.out.println("Hasil: V = "+volume+" cm^3");
    }
}
