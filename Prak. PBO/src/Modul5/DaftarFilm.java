/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author equinox
 */
public class DaftarFilm {

    private String JudulFilm, NamaAktor, Sutradara, Publisher, Kategori, stok;
        
    protected String getJudulFilm() {
        return JudulFilm;
    }

    protected void setJudulFilm(String JudulFilm) {
        this.JudulFilm = JudulFilm;
    }

    protected String getNamaAktor() {
        return NamaAktor;
    }

    protected void setNamaAktor(String NamaAktor) {
        this.NamaAktor = NamaAktor;
    }

    protected String getSutradara() {
        return Sutradara;
    }

    protected void setSutradara(String Sutradara) {
        this.Sutradara = Sutradara;
    }

    protected String getPublisher() {
        return Publisher;
    }

    protected void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    protected String getKategori() {
        return Kategori;
    }

    protected void setKategori(String Kategori) {
        if (Kategori.equals("SU")) {
            this.Kategori = "Semua Umur";
        } else if (Kategori.equals("A")) {
            this.Kategori = "Anak-Anak";
        } else if (Kategori.equals("D")) {
            this.Kategori = "Dewasa";
        } else if (Kategori.equals("R")) {
            this.Kategori = "Remaja";
        }
    }

    protected String getStok() {
        return stok;
    }

    protected void setStok(String stok) {
        this.stok = stok;
    }
}
