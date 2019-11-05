/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiJualBeli;

import AplikasiMenuLogin.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author equinox
 */
public class Menu {

    protected Menu() throws IOException {
        Session.cekStatusLogin();
        tampil();
    }

    protected void tampil() throws IOException {
        Session.pembatas();
        System.out.println("Hello (" + Session.getUsername() + ") " + Session.getNama());
        System.out.println("Pilih salah satu : "
                + "\n1. Transaksi Jual Beli Toko dan Supplier"
                + "\n2. Logout and exit");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.print("Pilihan Anda : ");
        pilih = Integer.parseInt(bf.readLine());
        switch (pilih) {
            case 1:
                new TransaksiJualBeli();
                break;
            case 2:
                Session.Logout();
                break;
            default:
                System.out.println("Masukkan Pilihan Menu dengan Benar ! ");
                tampil();
        }
        bf = null;
    }
}
