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
public class MenghitungBangun {
    
    private double keliling, luas, volume, sisi, panjang, lebar, alas, tinggi;
    private double phi = 3.14;
    
    public void cetak(String cetak) {
        System.out.println(cetak);
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setKelilingPersegi() {
        keliling = 4 * sisi;
    }
    
    public double getKelilingPersegi() {
        return keliling;
    }
    
    public void setLuasPersegi() {
        luas = sisi * sisi;
    }
    
    public double getLuasPersegi() {
        return luas;
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setKelilingPersegiPanjang() {
        keliling = 2 * panjang + 2 * lebar;
    }
    
    public double getKelilingPersegiPanjang() {
        return keliling;
    }
    
    public void setLuasPersegiPanjang() {
        luas = panjang * lebar;
    }
    
    public double getLuasPersegiPanjang() {
        return luas;
    }
    
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setKelilingSegitiga() {
        keliling = 3 * alas;
    }
    
    public double getKelilingSegitiga() {
        return keliling;
    }
    
    public void setLuasSegitiga() {
        luas = (alas * tinggi) / 2;
    }
    
    public double getLuasSegitiga() {
        return luas;
    }
    
    public double KelilingJajarGenjang(double a, double b, double c, double d) {
        keliling = a + b + c + d;
        return keliling;
    }
    
    public void setLuasJajarGenjang() {
        luas = alas * tinggi;
    }
    
    public double getLuasJajarGenjang() {
        return luas;
    }
    
    public double KelilingBelahKetupat(double sisi) {
        keliling = 4 * sisi;
        return keliling;
    }
    
    public double LuasBelahKetupat(double sisi) {
        luas = sisi * sisi;
        return luas;
    }
    
    public double KelilingTrapesium(double a, double b, double c, double d) {
        keliling = a + b + c + d;
        return keliling;
    }
    
    public double LuasTrapesium(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        luas = ((sisiSejajar1 + sisiSejajar2) * tinggi) / 2;
        return luas;
    }
    
    public double KelilingLingkaran(double diameter) {
        keliling = phi * diameter;
        return keliling;
    }
    
    public double LuasLingkaran(double jari2) {
        luas = phi * jari2 * jari2;
        return luas;
    }
    
    public double KelilingLayang2(double d1, double d2) {
        keliling = (2 * d1) + (2 * d2);
        return keliling;
    }
    
    public double LuasLayang2(double d1, double d2) {
        luas = (d1 * d2) / 2;
        return luas;
    }
    
    public double VolumeBalok(double panjang, double lebar, double tinggi) {
        volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public double VolumeKubus(double sisi) {
        volume = sisi * sisi * sisi;
        return volume;
    }
    
    public double VolumePrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double TinggiPrisma) {
        volume = ((alasSegitiga * tinggiSegitiga) / 2) * TinggiPrisma;
        return volume;
    }
    
    public double VolumeLimasPersegi(double sisiAlas, double tinggi) {
        volume = ((sisiAlas * sisiAlas) * tinggi) / 3;
        return volume;
    }
    
    public double VolumeTabung(double jari2, double tinggi) {
        volume = 2 * (phi * jari2 * jari2) * tinggi;
        return volume;
    }
    
    public double VolumeKerucut(double jari2, double tinggi) {
        volume = ((phi * jari2 * jari2) * tinggi) / 3;
        return volume;
    }
    
    public double VolumeBola(double jari2) {
        volume = (4 * phi * jari2 * jari2 * jari2) / 3;
        return volume;
    }
}
