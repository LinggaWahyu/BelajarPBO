/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author equinox
 */
public class MainConstructorMotor {
    public static void main(String[] args) {
        String pemilik = "Ahmad Afif";
        String warna = "Merah";
        String merk = "Honda";
        
        ConstructorKendaraan.setPemilik(pemilik);
        System.out.println("Pemilik Kendaraan = " + ConstructorKendaraan.getPemilik());
        System.out.println("=======================================");
        
        ConstructorKendaraan ob = new ConstructorKendaraan(merk);
        ob.tampil("Merk Kendaraan = " + ob.getMerk());
        ob.tampil("Pemilik Kendaraan = " + ob.getPemilik());
        System.out.println("=======================================");
        
        ConstructorKendaraan ob2 = new ConstructorKendaraan();
        ob2.tampil("Merk Kendaraan (instant variable) = " + ob2.getMerk());
        ob2.tampil("Pemilik Kendaraan (static variable) = " + ob2.getPemilik());
        System.out.println("=======================================");
        
        ConstructorMotor ob3 = new ConstructorMotor(merk, warna);
        ob3.tampil("Merk Motor = " + ob3.getMerk());
        ob3.tampil("Warna Motor = " + ob3.getWarna());
        ob3.tampil("Pemilik Motor = " + ob3.getPemilik());
    }
}
