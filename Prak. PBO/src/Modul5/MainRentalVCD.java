/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author equinox
 */
public class MainRentalVCD extends RentalVCD {
    public static void main(String[] args) throws IOException {
        MainRentalVCD mn = new MainRentalVCD();
        
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
        mn.cetak("Masukkan jumlah film yang ingin di inputkan : ");
        int JumlahFilm = Integer.parseInt(data.readLine());
        
        mn.setArray(JumlahFilm);
        
        for (int i = 0; i < JumlahFilm; i++) {
            mn.cetak("\nMasukkan Data Film ke-" + (i+1) + "\n");
            mn.cetak("Judul Film\t: ");
            String JudulFilm = data.readLine();
            mn.cetak("Nama Aktor\t: ");
            String AktorFilm = data.readLine();
            mn.cetak("Sutradara\t: ");
            String Sutradara = data.readLine();
            mn.cetak("Publisher\t: ");
            String Publisher = data.readLine();
            mn.cetak("Kategori\t: ");
            String Kategori = data.readLine();
            mn.cetak("Stok\t\t: ");
            String Stok = data.readLine();
            
            mn.setJudulFilm(i, JudulFilm);
            mn.setNamaAktor(i, AktorFilm);
            mn.setSutradara(i, Sutradara);
            mn.setPublisher(i, Publisher);
            mn.setKategori(i, Kategori);
            mn.setStok(i, Stok);
        }
        mn.cetak("\nDaftar Film yang telah di inputkan : ");
        mn.displayFilm();
    }
}
