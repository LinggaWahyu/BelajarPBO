/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiJualBeli;

/**
 *
 * @author equinox
 */
public class Toko extends JualBeli {

    protected void keterangan() {
        System.out.println("\nToko : "
                + "\nToko " + getToko() + " membeli " + getBarang()
                + "\ndari Supplier " + getSupplier()+ " sebanyak " + getJumlah()
                + "\ndengan harga satuan " + getHarga_satuan() + "."
                + "\nUang yang diberikan kepada Supplier adalah " + getHarga_total() + "."
                + "\nJadi, uang Toko berkurang " + getHarga_total() + " dan"
                + " stok " + getBarang() + " bertambah " + getJumlah());
    }
}
