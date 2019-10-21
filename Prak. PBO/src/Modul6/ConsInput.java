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
public class ConsInput extends ConsMahasiswa {
    
    protected ConsInput() {
       
    }
    
    protected void inputMahasiswa() {
        String YorN;
        int i = 1;
        
        ConsMahasiswa.setNamaUniv(JOptionPane.showInputDialog("Masukkan Nama Universitas :"));
        super.tampil("Data Mahasiswa " + ConsMahasiswa.getNamaUniv());
        
        while (true) {
            JOptionPane.showMessageDialog(null, "Masukkan Data Mahasiswa ke-" + i);
            
            super.NIM = JOptionPane.showInputDialog("Masukkan NIM Mahasiswa : ");
            super.Nama = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa : ");
            super.Alamat = JOptionPane.showInputDialog("Masukkan Alamat Mahasiswa");
            super.Jurusan = JOptionPane.showInputDialog("Masukkan Jurusan Mahasiswa : ");

            ConsMahasiswa ob = new ConsMahasiswa(NIM, Nama, Alamat, Jurusan);
            ob.tampil("\nData Mahasiswa ke-" + i);
            ob.tampil("NIM         : " + ob.getNIM());
            ob.tampil("Nama        : " + ob.getNama());
            ob.tampil("Alamat      : " + ob.getAlamat());
            ob.tampil("Jurusan     : " + ob.getJurusan());
            
            YorN = JOptionPane.showInputDialog("Apakah Anda Ingin Memasukkan Data Lagi ? (Y/N)");
            if (YorN.equals("N")) {
                System.exit(0);
            }
            i++;
        }
    }
}
