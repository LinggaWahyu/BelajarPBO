/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDimensi2;

/**
 *
 * @author equinox
 */
public class MainArray2 {

    public static void main(String[] args) {
        String[][] mahasiswa = {
            {"NIM", "NAMA"},
            {"18650123", "Andri"},
            {"18650124", "Ratih"},
            {"18650125", "Budi"}};
        
        Array2 ar = new Array2();
        ar.cetak("Data Mahasiswa : ");
        ar.setMhs(mahasiswa);
        ar.cetak(mahasiswa);
        ar.hapus();
    }
}
