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
        int[][] A = {{3,2,6,3},{8,5,6,8}};
        int[] C = {9,3,10,6,11};
        
        MainArrayUTS ob = new MainArrayUTS();
        
        ob.setC(A, C);
        ob.tampil(ob.getC());
    }
}
