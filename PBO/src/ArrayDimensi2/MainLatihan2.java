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
public class MainLatihan2 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        
        Latihan2 lt = new Latihan2();
        
        lt.tampil("Matrik bilangan : ");
        lt.setBilangan(A);
        lt.tampil(lt.getBilangan());
        
        lt.tampil("\n\nMatrik setelah di jumlahkan :");
        lt.setPenjumlahan(A, 3);
        lt.tampil(lt.getPenjumlahan());
        
        lt.tampil("\n\nIndek pada Matrik : ");
        lt.setIndex(A);
        lt.tampil(lt.getIndex());
        
        lt.tampil("\n\nGanjil Genap pada Matrik : ");
        lt.setGanjilGenap(A);
        lt.tampil(lt.getGanjilGenap());
    }
}
