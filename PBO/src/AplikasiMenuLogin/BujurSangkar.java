/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiMenuLogin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author equinox
 */
public class BujurSangkar {
    private int sisi, luasBujurSangkar;
    
    protected BujurSangkar() throws IOException {
        Session.cekStatusLogin();
        tampil();
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getLuasBujurSangkar() {
        return luasBujurSangkar;
    }

    public void setLuasBujurSangkar() {
        this.luasBujurSangkar = sisi * sisi;
    }
    
    protected void tampil() throws IOException {
        Session.pembatas();
        System.out.println("Hello (" + Session.getUsername() + ") " + Session.getNama());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int sisi;
        System.out.println("Menghitung Luas Bujur Sangkar ");
        System.out.print("Sisi = ");
        sisi = Integer.parseInt(bf.readLine());
        this.setSisi(sisi);
        this.setLuasBujurSangkar();
        System.out.println("Luas Bujur Sangkar = " + this.getLuasBujurSangkar());
        
        new Menu();
        bf = null;
    }
}
