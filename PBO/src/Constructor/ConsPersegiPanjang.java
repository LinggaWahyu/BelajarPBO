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
public class ConsPersegiPanjang {
    private int panjang, lebar, luas;
    
    public ConsPersegiPanjang() {
        
    }

    public ConsPersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        setLuas();
    }
    
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas() {
        luas = panjang * lebar;
    }
    
    public void tampil(String a) {
        System.out.println(a);
    }
}
