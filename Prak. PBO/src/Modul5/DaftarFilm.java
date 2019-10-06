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

    protected String[][] Film;
    private String JudulFilm, NamaAktor, Sutradara, Publisher, Kategori, stok;
        
    protected String getJudulFilm() {
        return JudulFilm;
    }

    protected void setJudulFilm(int index, String JudulFilm) {
        Film[index][0] = JudulFilm;
    }

    protected String getNamaAktor() {
        return NamaAktor;
    }

    protected void setNamaAktor(int index, String NamaAktor) {
        Film[index][1] = NamaAktor;
    }

    protected String getSutradara() {
        return Sutradara;
    }

    protected void setSutradara(int index, String Sutradara) {
        Film[index][2] = Sutradara;
    }

    protected String getPublisher() {
        return Publisher;
    }

    protected void setPublisher(int index, String Publisher) {
        Film[index][3] = Publisher;
    }

    protected String getKategori() {
        return Kategori;
    }

    protected void setKategori(int index, String Kategori) {
        Film[index][4] = Kategori;
    }

    protected String getStok() {
        return stok;
    }

    protected void setStok(int index, String stok) {
        Film[index][5] = stok;
    }
}
