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
public class MainJualBeli extends JualBeli {
    
    protected void tampil(JualBeli[] ob, String toko, String supplier, String barang, int jumlah, long harga_satuan) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].setToko(toko);
            ob[i].setSupplier(supplier);
            ob[i].setBarang(barang);
            ob[i].setJumlah(jumlah);
            ob[i].setHarga_satuan(harga_satuan);
            ob[i].setHarga_total();
            ob[i].keterangan();
            System.out.println("=======================================");
        }
    }
    
    public static void main(String[] args) {
        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;
        
        toko = "Barokah";
        supplier = "PT. Jaya Makmur";
        barang = "Pensil";
        jumlah = 100;
        harga_satuan = 1500;
        
        JualBeli[] obj = {new Supplier(), new Toko()};
        
        MainJualBeli ob = new MainJualBeli();
        
        ob.keterangan();
        System.out.println("=======================================");
        ob.tampil(obj, toko, supplier, barang, jumlah, harga_satuan);
    }
}
