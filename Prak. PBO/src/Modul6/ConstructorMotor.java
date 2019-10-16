/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author equinox
 */
public class ConstructorMotor extends ConstructorKendaraan {
    private String warna;
    
    protected ConstructorMotor(String merk, String warna) {
        super(merk);
        this.warna = warna;
        
        merk = null;
        warna = null;
    }

    public String getWarna() {
        return warna;
    }
    
    protected void hapus() {
        warna = null;
        super.hapus();
    }
}
