/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menghitung_Bangun;

/**
 *
 * @author equinox
 */
public class MainMenghitungBangun {    
    public static void main(String[] args) {
        
        MenghitungBangun ht = new MenghitungBangun();
        
        ht.setSisi(5);
        ht.cetak("Menghitung Luas dan Keliling Persegi");
        ht.cetak("=======================");
        ht.cetak("Sisi Persegi = " + ht.getSisi());
        ht.setLuasPersegi();
        ht.cetak("Luas Persegi = " + ht.getLuasPersegi());
        ht.setKelilingPersegi();
        ht.cetak("Keliling Persegi = " + ht.getKelilingPersegi());
        
        ht.cetak("\nMenghitung Luas dan Keliling Persegi Panjang");
        ht.cetak("=======================");
        ht.setPanjang(4);
        ht.setLebar(2);
        ht.cetak("Lebar = " + ht.getLebar());
        ht.cetak("Panjang = " + ht.getPanjang());
        ht.setLuasPersegiPanjang();
        ht.cetak("Luas Persegi Panjang = " + ht.getLuasPersegi());
        ht.setKelilingPersegiPanjang();
        ht.cetak("Keliling Persegi Panjang = " + ht.getKelilingPersegiPanjang());
        
        ht.cetak("\nMenghitung Luas dan Keliling Segitiga");
        ht.cetak("=======================");
        ht.setAlas(3);
        ht.setTinggi(5);
        ht.cetak("Alas = " + ht.getAlas());
        ht.cetak("Tinggi = " + ht.getTinggi());
        ht.setLuasSegitiga();
        ht.cetak("Luas Segitiga = " + ht.getLuasSegitiga());
        ht.setKelilingSegitiga();
        ht.cetak("Keliling Segitiga = " + ht.getKelilingSegitiga());
    }
}
