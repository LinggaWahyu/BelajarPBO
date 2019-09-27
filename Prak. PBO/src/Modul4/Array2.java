/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author equinox
 */
public class Array2 {
    private int[][] dataA, dataB, matrikPenjumlahan;
    double[][] matrikPerkalian;

    public int[][] getDataA() {
        return dataA;
    }

    public void setDataA(int[][] dataA) {
        this.dataA = dataA;
    }

    public int[][] getDataB() {
        return dataB;
    }

    public void setDataB(int[][] dataB) {
        this.dataB = dataB;
    }

    public int[][] getMatrikPenjumlahan() {
        return matrikPenjumlahan;
    }

    public void setMatrikPenjumlahan(int[][] matrikA, int[][] matrikB) {
        matrikPenjumlahan = new int[matrikA.length][matrikA[0].length];
        
        int angka;
        for (int i = 0; i < matrikA.length; i++) {
            for (int j = 0; j < matrikA[i].length; j++) {
                angka = matrikA[i][j] + matrikB[i][j];
                matrikPenjumlahan[i][j] = angka;
            }
        }
    }

    public double[][] getMatrikPerkalian() {
        return matrikPerkalian;
    }

    public void setMatrikPerkalian(int[][] matrik, double angka) {
        matrikPerkalian = new double[matrik.length][matrik[0].length];
        
        double bilangan;
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                bilangan = Double.valueOf(matrik[i][j] * angka);
                matrikPerkalian[i][j] = bilangan;
            }
        }
    }
    
    public void tampil(String a) {
        System.out.println(a);
    }
    
    public void tampil(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }
    }
    
    public void tampil(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}
