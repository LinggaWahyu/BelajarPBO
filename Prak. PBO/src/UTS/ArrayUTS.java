/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author equinox
 */
public class ArrayUTS {
    int[][] Deret;
    int[] Cari;    
    String[][] Indeks;
    String[] Index;

    public int[][] getDeret() {
        return Deret;
    }

    public void setDeret(int[][] Deret) {
        this.Deret = Deret;
    }

    public String[][] getIndeks() {
        return Indeks;
    }

    public void setIndeks(int[][] bilangan) {
        this.Indeks = new String[bilangan.length][bilangan[0].length];
        
        String angka, baris, kolom, kata;
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                angka = String.valueOf(bilangan[i][j]);
                baris = String.valueOf(i);
                kolom = String.valueOf(j);
                kata = angka + " terdapat pada baris " + baris + " kolom " + kolom;
                this.Indeks[i][j] = kata;
            }
        }
    }

    public int[] getCari() {
        return Cari;
    }

    public void setCari(int angka) {
        this.Cari = Cari;
    }

    public String[] getIndex() {
        return Index;
    }

    public void setIndex(int[] deret) {
        this.Index = new String[deret.length];
        
        String angka, indeks, kata;
        for (int i = 0; i < deret.length; i++) {
            angka = String.valueOf(deret[i]);
            indeks = String.valueOf(i);
            kata = angka + " terdapat pada index " + indeks;
            Index[i] = kata;
        }
    }
    
    public void tampil(String a) {
        System.out.println(a);
    }
    
    public void tampil(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void tampil(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  \t");
            }
            System.out.println();
        }
    }
    
    public void tampil(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
