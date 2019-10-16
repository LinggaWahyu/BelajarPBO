/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author equinox
 */
public class InheritanceBujurSangkar extends InheritanceBidangDatar {
    private int sisi, luas;

    protected int getSisi() {
        return sisi;
    }

    protected void setSisi(int sisi) {
        this.sisi = sisi;
    }

    protected int getLuas() {
        return luas;
    }

    protected void setLuas() {
        this.luas =  sisi * sisi;
    }
    
    @Override
    protected void keterangan() {
        System.out.println("Ini adalah Child Class");
    }
    
    protected void keterangan_parent() {
        super.keterangan();
    }
}
