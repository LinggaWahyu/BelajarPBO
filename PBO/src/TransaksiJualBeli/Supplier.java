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
public class Supplier extends JualBeli {
    
    protected void keterangan() {
        System.out.println("Supplier : "
                + "\nSupplier " + getSupplier() + " menjual " + getBarang()
                + "\nkepada Toko " + getToko() + " sebanyak " + getJumlah()
                + "\ndengan harga satuan " + getHarga_satuan() + "."
                + "\nUang yang diterima Supplier adalah " + getHarga_total() + "."
                + "\nJadi, uang Suplier bertambah " + getHarga_total() + " dan"
                + " stok " + getBarang() + " berkurang " + getJumlah());
    }
}
