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
public class Data {
    protected String[][] LJU;
    protected String[] Kunci;
    
    protected Data(String[][] LJU, String[] Kunci) {
        this.setLJU(LJU);
        this.setKunci(Kunci);
    }

    protected String[][] getLJU() {
        return LJU;
    }

    protected void setLJU(String[][] LJU) {
        this.LJU = LJU;
    }

    protected String[] getKunci() {
        return Kunci;
    }

    protected void setKunci(String[] Kunci) {
        this.Kunci = Kunci;
    }

    public void tampil(String a) {
        System.out.print(a);
    }
    
    public void tampil(String[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void tampil(String[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
