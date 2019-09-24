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
public class MainLatihan {
    public static void main(String[] args) {
        
        int[] bilangan = {1,2,3,4,5};
        
        Latihan lt = new Latihan();
        
        lt.tampil("Deret Bilangan : ");
        lt.setBilangan(bilangan);
        lt.tampil(lt.getBilangan());
        
        lt.tampil("\n\nSetelah Dijumlahkan :");
        lt.setPenjumlahan(bilangan, 5);
        lt.tampil(lt.getPenjumlahan());
        
        lt.tampil("\n\nKeterangan index deret bilangan : ");
        lt.setIndex(bilangan);
        lt.tampil(lt.getIndex());
        
        lt.tampil("\n\nKeterangan ganjil/genap deret bilangan : ");
        lt.setGanjilGenap(bilangan);
        lt.tampil(lt.getGanjilGenap());
    }
}
