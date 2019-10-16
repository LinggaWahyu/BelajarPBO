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
public class ConsPersegiPanjangParent {
    protected int panjang, sisi;
    
    protected ConsPersegiPanjangParent(int panjang, int sisi) {
        this.panjang = panjang;
        this.sisi = sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getSisi() {
        return sisi;
    }
    
    protected void cetak(String a) {
        System.out.println(a);
    }
}
