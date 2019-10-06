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
public class Latihan1 {
    private double rata_rata, nilai_max, nilai_min;
    private int posisi;
    
    public void cetak(String a) {
        System.out.println(a);
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(double[] bilangan, int nilai) {
        for (int i = 0; i < bilangan.length; i++) {
            if (nilai == bilangan[i]) {
                posisi = i;
            }
        }
    }

    public double getRata_rata() {
        return rata_rata;
    }

    public void setRata_rata(double[] bilangan) {
        double jumlah = 0;
        for (int i = 0; i < bilangan.length; i++) {
            jumlah += bilangan[i];
        }
        this.rata_rata = jumlah / bilangan.length;
    }

    public double getNilai_max() {
        return nilai_max;
    }

    public void setNilai_max(double[] bilangan) {
        nilai_max = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] < nilai_max) {
                nilai_max = bilangan[i];
            }
        }
    }

    public double getNilai_min() {
        return nilai_min;
    }

    public void setNilai_min(double[] bilangan) {
        nilai_min = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] > nilai_min) {
                nilai_min = bilangan[i];
            }
        }
    }
    
    public void hapus() {
        rata_rata = 0;
        nilai_max = 0;
        nilai_min = 0;
        posisi = 0;
    }
}
