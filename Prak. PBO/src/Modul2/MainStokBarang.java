/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author equinox
 */
public class MainStokBarang {
    public static void main(String[] args) {
        StokBarang sb = new StokBarang();
        
        sb.setNama("Bolpoint");
        sb.cetak("Nama Alat Tulis : " + sb.getNama());
        sb.setStok(11);
        sb.cetak("Stok : " + sb.getStok());
        sb.setHarga_satuan(2000);
        sb.cetak("Harga Satuan : " + sb.getHarga_satuan());
        sb.setHarga(sb.getHarga_satuan());
        sb.cetak("Harga " + sb.getNama() + " : " + sb.getHarga());
        sb.setTotal_harga(sb.getHarga());
        
        sb.setNama("Pensil");
        sb.cetak("\nNama Alat Tulis : " + sb.getNama());
        sb.setStok(10);
        sb.cetak("Stok : " + sb.getStok());
        sb.setHarga_satuan(1000);
        sb.cetak("Harga Satuan : " + sb.getHarga_satuan());
        sb.setHarga(sb.getHarga_satuan());
        sb.cetak("Harga " + sb.getNama() + " : " + sb.getHarga());
        sb.setTotal_harga(sb.getHarga());
        
        sb.setNama("Penghapus");
        sb.cetak("\nNama Alat Tulis : " + sb.getNama());
        sb.setStok(10);
        sb.cetak("Stok : " + sb.getStok());
        sb.setHarga_satuan(500);
        sb.cetak("Harga Satuan : " + sb.getHarga_satuan());
        sb.setHarga(sb.getHarga_satuan());
        sb.cetak("Harga " + sb.getNama() + " : " + sb.getHarga());
        sb.setTotal_harga(sb.getHarga());    
    
        sb.cetak("\nTotal Harga : " + sb.getTotal_harga());
    }
}
