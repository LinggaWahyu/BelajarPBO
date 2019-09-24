/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDimensi1;

/**
 *
 * @author equinox
 */
public class MainArray1 {
    public static void main(String[] args) {
        Array1 ob = new Array1();
        String[] mahasiswa = {"Doni", "Ratih", "Budi"};
        
        ob.setMhs(mahasiswa);
        ob.cetak(ob.getMhs());
        ob.hapus();
        mahasiswa = null;
        ob = null;
    }
}
