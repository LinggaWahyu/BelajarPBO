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
public class OperasiPembagian extends OperasiBilangan {
    
    protected double a, b, c;

    protected double getA() {
        return a;
    }

    protected void setA(double a) {
        this.a = a;
    }

    protected double getB() {
        return b;
    }

    protected void setB(double b) {
        this.b = b;
    }

    protected double getC() {
        return c;
    }

    protected void setC() {
        this.c = a / b;
    }
    
    protected void tampil() {
        System.out.println("Operasi Penjumlahan " + a + " / " + b + " = " + getC());
    }
}
