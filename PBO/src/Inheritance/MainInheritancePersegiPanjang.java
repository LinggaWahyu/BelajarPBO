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
public class MainInheritancePersegiPanjang extends InheritancePersegiPanjang {
    public static void main(String[] args) {
        MainInheritancePersegiPanjang mn = new MainInheritancePersegiPanjang();
        
        mn.setPanjang(2);
        mn.cetak("Panjang : " + mn.getPanjang());
        mn.setLebar(4);
        mn.cetak("Lebar : " + mn.getLebar());
        mn.setLuas();
        mn.cetak("Luas Persegi Panjang : " + mn.getLuas());
    }
}
