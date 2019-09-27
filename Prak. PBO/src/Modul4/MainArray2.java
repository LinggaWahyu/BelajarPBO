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
public class MainArray2 {
    public static void main(String[] args) {
        int[][] matrikA = {{1,2},{3,5},{6,7}};
        int[][] matrikB = {{8,9},{10,11},{12,13}};
        
        Array2 ar = new Array2();
        
        ar.tampil("Terdapat Matrik A :");
        ar.setDataA(matrikA);
        ar.tampil(ar.getDataA());
        
        ar.tampil("\n\nTerdapat Matrik B :");
        ar.setDataB(matrikB);
        ar.tampil(ar.getDataB());
        
        ar.tampil("\n\nMaka Matrik C :");
        ar.setMatrikPenjumlahan(matrikA, matrikB);
        ar.tampil(ar.getMatrikPenjumlahan());
        
        ar.tampil("\n\nHasil Perkalian Matrik :");
        ar.setMatrikPerkalian(ar.getMatrikPenjumlahan(), 0.5);
        ar.tampil(ar.getMatrikPerkalian());
    }
}
