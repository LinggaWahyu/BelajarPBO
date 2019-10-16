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
public class ConsPersegiPanjangMain2 {
    public static void main(String[] args) {
        int panjang = 6, lebar = 2, sisi = 8;
        
        ConsPersegiPanjangChild ob = new ConsPersegiPanjangChild(panjang, sisi, lebar);
        
        ob.cetak("Panjang : " + ob.getPanjang());
        ob.cetak("Lebar : " + ob.getLebar());
        ob.cetak("Luas : " + ob.getLuas());
        
        ob.cetak("\nSisi : " + ob.getSisi());
        ob.cetak("Luas : " + ob.getLuasPersegi());
    }
}
