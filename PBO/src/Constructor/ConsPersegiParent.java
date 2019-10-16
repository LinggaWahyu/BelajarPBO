/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author equinox
 */
public class ConsPersegiParent {

    private int sisi, panjang, lebar;

    protected ConsPersegiParent(int sisi, int panjang, int lebar) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    protected int getPanjang() {
        return panjang;
    }

    protected int getLebar() {
        return lebar;
    }

    protected int getSisi() {
        return sisi;
    }

    protected void tampil(String a) {
        System.out.println(a);
    }
}
