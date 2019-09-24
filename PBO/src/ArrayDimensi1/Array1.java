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
public class Array1 {
    
    private String[] mhs;

    public String[] getMhs() {
        return mhs;
    }

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
    }
    
    public void cetak(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    
    public void hapus() {
        mhs = null;
    }
}
