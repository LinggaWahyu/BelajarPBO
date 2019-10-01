/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDimensi2;

/**
 *
 * @author equinox
 */
public class Latihan2 {
    
    private int[][] bilangan, penjumlahan;
    private String[][] index, GanjilGenap;
    
    public void tampil(String a) {
        System.out.println(a);
    }
    
    public void tampil(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }
    }
    
    public void tampil(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0) {
                    System.out.print(a[i][j]);
                } else {
                    System.out.print(" " + a[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public int[][] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[][] bilangan) {
        this.bilangan = bilangan;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int[][] bilangan, int angka) {
        penjumlahan = new int[bilangan.length][bilangan[0].length];
        
        int data;
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                data = bilangan[i][j] + angka;
                penjumlahan[i][j] = data;
            }
        }
    }

    public String[][] getIndex() {
        return index;
    }

    public void setIndex(int[][] bilangan) {
        index = new String[bilangan.length][bilangan[0].length];
        
        String angka, baris, kolom, kata;
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                angka = String.valueOf(bilangan[i][j]);
                baris = String.valueOf(i);
                kolom = String.valueOf(j);
                kata = "angka " + angka + " pada baris " + baris + " kolom " + kolom;
                index[i][j] = kata;
            }
        }
    }

    public String[][] getGanjilGenap() {
        return GanjilGenap;
    }

    public void setGanjilGenap(int[][] bilangan) {
        GanjilGenap = new String[bilangan.length][bilangan[0].length];
        
        String ganjil = "ganjil", genap = "genap ", kata, angka;
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                if (bilangan[i][j] % 2 == 1) {
                    angka = String.valueOf(bilangan[i][j]);
                    kata = "angka " + angka + " bilangan " + ganjil;
                    GanjilGenap[i][j] = kata;
                } else {
                    angka = String.valueOf(bilangan[i][j]);
                    kata = "angka " + angka + " bilangan " + genap;
                    GanjilGenap[i][j] = kata;
                }
            }
        }
    }
    
    public void hapus(){
        bilangan = 0;
        penjumlahan = 0;
        index = null;
        GanjilGenap = null;
        
    }
    
    
}
