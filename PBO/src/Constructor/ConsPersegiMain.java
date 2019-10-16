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
public class ConsPersegiMain {
    public static void main(String[] args) {
        int sisi = 9, panjang = 7, lebar = 9;
        ConsPersegiChild ob = new ConsPersegiChild(sisi, panjang, lebar);
        
        ob.tampil("Sisi : " + ob.getSisi());
        ob.tampil("Luas : " + ob.getLuas());
        
        ob.tampil("\nPanjang : " + ob.getPanjang());
        ob.tampil("Lebar : " + ob.getLebar());
        ob.tampil("Luas : " + ob.getLuasPP());
    }
}
