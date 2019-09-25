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
public class Latihan2 {
    private int[] bilangan_baru, bilangan;
    private double[] bilangan_kali;

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }
    
    public void cetak(String a) {
        System.out.println(a);
    }
    
    public void cetak(int[] bilangan) {
        for (int i = 0; i < bilangan.length; i++) {
            if (i == 0) {
                System.out.print(bilangan[i]);
            } else {
                System.out.print(", " + bilangan[i]);
            }
        }
    }
    
    public int[] getBilangan_baru() {
        return bilangan_baru;
    }

    public void setBilangan_baru(int[] bilangan_baru, int angka_awal, int angka_baru) {
        this.bilangan_baru = new int[bilangan_baru.length];
        
        for (int i = 0; i < bilangan_baru.length; i++) {
            if (bilangan_baru[i] == angka_awal) {
                this.bilangan_baru[i] = angka_baru;
            } else {
                this.bilangan_baru[i] = bilangan_baru[i];
            }
        }
    }

     public double[] getBilangan_kali() {
        return bilangan_kali;
    }

    public void setBilangan_kali(int[] bilangan_kali, double nilai) {     
        this.bilangan_kali = new double[bilangan_kali.length];
   
        for (int i = 0; i < bilangan_kali.length; i++) {
            double hasil = Double.valueOf(bilangan_kali[i]);
            this.bilangan_kali[i] = hasil *= nilai;
        }
    }
    
    public void cetak(double[] bilangan) {
       for (int i = 0; i < bilangan.length; i++) {
            if (i == 0) {
                System.out.print(bilangan[i]);
            } else {
                System.out.print(", " + bilangan[i]);
            }
        }
    }
}
