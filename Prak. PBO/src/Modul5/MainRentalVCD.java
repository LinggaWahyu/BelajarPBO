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
        
        mn.setJmlFilm();
        mn.InsertFilm(mn.getJmlFilm());
    }
}
