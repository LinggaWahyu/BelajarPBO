/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author equinox
 */
public class MainArrayUTS extends ArrayUTS {
    public static void main(String[] args) {
        int[][] A = {{5,11},{8,9},{11,4},{4,6}};
        int[] C = {1,2,3,4,5,6};
        
        MainArrayUTS ob = new MainArrayUTS();
        
        ob.tampil("Nilai Matrik A :");
        ob.setDeret(A);
        ob.tampil(ob.getDeret());
        
        ob.tampil("\nBaris Kolom pada Matrik A : ");
        ob.setIndeks(A);
        ob.tampil(ob.getIndeks());
        
        ob.tampil("\nIndex pada Matrik C : ");
        ob.setIndex(C);
        ob.tampil(ob.getIndex());
    }
}
