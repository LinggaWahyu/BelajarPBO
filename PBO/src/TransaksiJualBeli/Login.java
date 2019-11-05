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
public class Login {
    protected Login() throws IOException {
        tampil();
    }
    
    protected void tampil() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String username, password;
        
        System.out.print("Username Anda : ");
        username = bf.readLine();
        System.out.print("Password Anda : ");
        password = bf.readLine();
        
        Session.setStatusLogin(username, password);
        
        if (Session.getStatusLogin() == "aktif") {
            new Menu();
        } else {
            Session.pembatas();
            System.out.println("Masukkan username dan password Anda dengan benar !");
            tampil();
        }
        
        username = null;
        password = null;
        bf = null;
    }
}
