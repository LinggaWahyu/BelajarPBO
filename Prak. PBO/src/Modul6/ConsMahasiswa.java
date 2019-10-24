/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

import javax.swing.JOptionPane;

/**
 *
 * @author equinox
 */
public class ConsMahasiswa {
    protected String NIM, Nama, Alamat, Jurusan;
    private static String NamaUniv;
    
    protected ConsMahasiswa() {
        
    }
    
    protected ConsMahasiswa(String NIM, String Nama, String Alamat, String Jurusan) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        setJurusan(Jurusan);
    }

    protected String getNIM() {
        return NIM;
    }

    protected String getNama() {
        return Nama;
    }

    protected String getAlamat() {
        return Alamat;
    }

    protected String getJurusan() {
        return Jurusan;
    }

    protected void setJurusan(String Jurusan) {
        if (Jurusan.equals("61")) {
            this.Jurusan = "MATEMATIKA";
        } else if (Jurusan.equals("62")) {
            this.Jurusan = "BIOLOGI";
        } else if (Jurusan.equals("63")) {
            this.Jurusan = "KIMIA";
        } else if (Jurusan.equals("64")) {
            this.Jurusan = "FISIKA";
        } else if (Jurusan.equals("65")) {
            this.Jurusan = "TEKNIK INFORMATIKA";
        } else if (Jurusan.equals("66")) {
            this.Jurusan = "TEKNIK ARSITEKTUR";
        }
    }
    
     protected static String getNamaUniv() {
        return ConsMahasiswa.NamaUniv;
    }

    protected static void setNamaUniv(String NamaUniv) {
        ConsMahasiswa.NamaUniv = NamaUniv;
    }
    
     protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }
    
    protected void hapus() {
        NIM = null;
        Nama = null;
        Alamat = null;
        Jurusan = null;
    }    
}
