/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiJualBeli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author equinox
 */
public class TransaksiJualBeli extends JualBeli {

    protected TransaksiJualBeli() throws IOException {
        Session.cekStatusLogin();
        tampil();
    }

    protected void cetak(JualBeli[] ob, String toko, String supplier, String barang, int jumlah, long harga_satuan) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].setToko(toko);
            ob[i].setSupplier(supplier);
            ob[i].setBarang(barang);
            ob[i].setJumlah(jumlah);
            ob[i].setHarga_satuan(harga_satuan);
            ob[i].setHarga_total();
            ob[i].keterangan();
        }
    }

    protected void tampil() throws IOException {
        Session.pembatas();
        System.out.println("Hello (" + Session.getUsername() + ") " + Session.getNama());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;
        
        System.out.print("Nama Toko : ");
        toko = bf.readLine();
        System.out.print("Nama Supplier : ");
        supplier = bf.readLine();
        System.out.print("Nama Barang : ");
        barang = bf.readLine();
        System.out.print("Jumlah : ");
        jumlah = Integer.parseInt(bf.readLine());
        System.out.print("Harga satuan : ");
        harga_satuan = Long.parseLong(bf.readLine());
        
        JualBeli[] obj = {new Supplier(), new Toko()};
        
        System.out.println();
        cetak(obj, toko, supplier, barang, jumlah, harga_satuan);
        
        new Menu();
    }
}
