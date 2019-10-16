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
public class ConsPersegiPanjangMain {
    public static void main(String[] args) {
        int panjang = 6, lebar = 2;
        
        ConsPersegiPanjang ob = new ConsPersegiPanjang(panjang, lebar);
        ob.tampil("Panjang : " + ob.getPanjang());
        ob.tampil("Lebar : " + ob.getLebar());
        ob.tampil("Luas : " + ob.getLuas());
    }
}
