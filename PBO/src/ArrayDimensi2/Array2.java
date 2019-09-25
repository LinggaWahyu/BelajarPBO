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
public class Array2 {
    private String[][] mhs;

    public String[][] getMhs() {
        return mhs;
    }

    public void setMhs(String[][] mhs) {
        this.mhs = mhs;
    }
    
    public void cetak(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void cetak(String data) {
        System.out.println(data);
    }
    
    public void hapus() {
        mhs = null;
    }
}
