/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDimensi1;

/**
 *
 * @author equinox
 */
public class Latihan {
    
    private int[] bilangan, penjumlahan;
    private String[] index, GanjilGenap;

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }
    
    public void tampil(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print(a[i]);
            } else {
                System.out.print(", " + a[i]);
            }
        }
        a = 0;
    }
    
    public void tampil(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        a = null;
    }
    
    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
        bilangan = 0;
    }

    public int[] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int[] bilangan, int angka) {
        
        penjumlahan = new int[bilangan.length];
        
        for (int i = 0; i < bilangan.length; i++) {
            penjumlahan[i] = bilangan[i] + angka;
        }
        bilangan = 0;
        angka = 0;
    }

    public String[] getIndex() {
        return index;
    }

    public void setIndex(int[] bilangan) {
        String angka, indeks, kata;
        
        index = new String[bilangan.length];
        
        for (int i = 0; i < bilangan.length; i++) {
            angka = Integer.toString(bilangan[i]);
            indeks = Integer.toString(i);
            kata = angka + " terdapat pada index " + indeks;
            this.index[i] = kata; 
        }
        bilangan = 0;
    }

    public String[] getGanjilGenap() {
        return GanjilGenap;
    }

    public void setGanjilGenap(int[] bilangan) {
        String kata, angka, ganjil = "Ganjil", genap = "Genap";
        
        GanjilGenap = new String[bilangan.length];
        
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 == 1) {
                angka = Integer.toString(bilangan[i]);
                kata = angka + " adalah bilangan " + ganjil;
                this.GanjilGenap[i] = kata;
            } else {
                angka = Integer.toString(bilangan[i]);
                kata = angka + " adalah bilangan " + genap;
                this.GanjilGenap[i] = kata;
            }
        }
        bilangan = null;
    }
    
    public void hapus(){
        bilangan = 0;
        penjumlahan = 0;
        GanjilGenap = null;
        index = null;
    }
}
