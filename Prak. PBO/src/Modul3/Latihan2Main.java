/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author equinox
 */
public class Latihan2Main {
    public static void main(String[] args) {
        int[] bilangan = {2,5,3,5,9,5};
        
        Latihan2 lt = new Latihan2();
        
        lt.setBilangan_baru(bilangan, 5, 1);
        lt.cetakArrayBaru(lt.getBilangan_baru());
        
        } 
    }

