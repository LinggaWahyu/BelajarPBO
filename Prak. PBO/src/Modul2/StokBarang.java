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
public class StokBarang {
    private String nama;
    private int stok, harga_satuan, harga, total_harga;

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int harga_barang) {
        this.total_harga += harga_barang;
    }
    
    public void cetak(String a) {
        System.out.println(a);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga_satuan) {
        harga = this.getStok() * harga_satuan;
    }
    
    public void hapus(){
        nama = null;
        stok = 0;
        harga_satuan = 0;
        harga = 0;
        total_harga = 0;
    }
}
    
