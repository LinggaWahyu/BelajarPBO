/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author equinox
 */
public class Latihan1Main {
    public static void main(String[] args) {
        double[] bilangan = {-5, -3, -6, -3, -4};
        
        Latihan1 lt = new Latihan1();
        
        lt.setRata_rata(bilangan);
        lt.cetak("Nilai Rata - Rata = " + lt.getRata_rata());
        
        lt.setNilai_max(bilangan);
        lt.cetak("Nilai Maksimum = " + lt.getNilai_max());
        
        lt.setNilai_min(bilangan);
        lt.cetak("Nilai Maksimum = " + lt.getNilai_min());
        
        int angka = -3;
        lt.setPosisi(bilangan, angka);
        lt.cetak("Angka " + angka + " terdapat pada index " + lt.getPosisi());
    }
}
