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
public class RentalVCD extends DaftarFilm {
    
    protected void cetak(String a) {
        System.out.print(a);
    }

    protected void setArray(int JumlahFilm) {
        super.Film = new String[JumlahFilm][6];
    }
    
    protected void displayFilm() {
        for (int i = 0; i < super.Film.length; i++) {
            this.cetak("\n\nData Film ke-" + (i+1));
            this.cetak("\nJudul      : " + super.Film[i][0]);
            this.cetak("\nNama Aktor : " + super.Film[i][1]);
            this.cetak("\nSutradara  : " + super.Film[i][2]);
            this.cetak("\nPublisher  : " + super.Film[i][3]);
            this.cetak("\nKategori   : " + super.Film[i][4]);
            this.cetak("\nStok       : " + super.Film[i][5]);
        }
    }
}
