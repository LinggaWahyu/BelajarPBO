/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author equinox
 */
public class OperasiBilanganCetak extends OperasiBilangan {

    private void cetakSemua(OperasiBilangan[] obj, double a, double b) {
        for (int i = 0; i < obj.length; i++) {
            obj[i].setA(a);
            obj[i].setB(b);
            obj[i].setC();
            obj[i].tampil();
            System.out.println("==========================");
        }
    }

    public static void main(String[] args) {

        double a = 10.5;
        double b = 0.5;

        OperasiBilangan[] obj = {new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        OperasiBilanganCetak ob = new OperasiBilanganCetak();

        ob.cetakSemua(obj, a, b);
    }

}
