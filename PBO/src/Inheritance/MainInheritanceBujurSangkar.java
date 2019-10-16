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
public class MainInheritanceBujurSangkar extends InheritanceBujurSangkar {
    public static void main(String[] args) {
        MainInheritanceBujurSangkar mn = new MainInheritanceBujurSangkar();
        
        mn.setSisi(2);
        mn.cetak("Sisi : " + mn.getSisi());
        mn.setLuas();
        mn.cetak("Luas Bujur Sangkar : " + mn.getLuas());
        mn.keterangan();
        mn.keterangan_parent();
        mn = null;
    }
}
