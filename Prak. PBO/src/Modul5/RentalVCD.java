/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;

/**
 *
 * @author equinox
 */
public class RentalVCD extends DaftarFilm {
    private String input;
    private int JmlFilm;
    
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    
    protected void cetak(String a) {
        System.out.print(a);
    }

    protected int getJmlFilm() {
        return JmlFilm;
    }

    protected void setJmlFilm() throws IOException {
        this.cetak("Masukkan Jumlah Film : ");
        this.JmlFilm = Integer.parseInt(data.readLine());
    }
    
    protected void Kategori() {
        
    }
    
    protected void InsertFilm(int JumlahFilm) throws IOException {
        for (int i = 1; i <= JumlahFilm; i++) {
            this.cetak("====================================");
            this.cetak("\nMasukkan Data Film ke-" + i);
            this.cetak("\nJudul\t\t: ");
            input = data.readLine();
            super.setJudulFilm(input);
            this.cetak("Nama Aktor\t: ");
            input = data.readLine();
            super.setNamaAktor(input);
            this.cetak("Sutradara\t: ");
            input = data.readLine();
            super.setSutradara(input);
            this.cetak("Publisher\t: ");
            input = data.readLine();
            super.setPublisher(input);
            this.cetak("Kategori\t: ");
            input = data.readLine();
            super.setKategori(input);
            this.cetak("Stok\t\t: ");
            input = data.readLine();
            super.setStok(input);
            
            this.cetak("\nData Film ke-" + i);
            this.displayFilm();
        }
    }

    protected void displayFilm() {
        this.cetak("\nJudul      : " + super.getJudulFilm());
        this.cetak("\nNama Aktor : " + super.getNamaAktor());
        this.cetak("\nSutradara  : " + super.getSutradara());
        this.cetak("\nPublisher  : " + super.getPublisher());
        this.cetak("\nKategori   : " + super.getKategori());
        this.cetak("\nStok       : " + super.getStok() + "\n");
    }
}
