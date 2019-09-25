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
        
        lt.cetak("Deret bilangan awal");
        lt.setBilangan(bilangan);
        lt.cetak(lt.getBilangan());
        
        lt.cetak("\n\nDeret bilangan setelah diganti");
        lt.setBilangan_baru(bilangan, 5, 1);
        lt.cetak(lt.getBilangan_baru());
        
        lt.cetak("\n\nDeret bilangan setelah dikali");
        lt.setBilangan_kali(lt.getBilangan_baru(), 0.5);
        lt.cetak(lt.getBilangan_kali());
        } 
    }

