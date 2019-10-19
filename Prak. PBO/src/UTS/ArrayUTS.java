/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author equinox
 */
public class ArrayUTS {

    String[] C;

    public String[] getC() {
        return C;
    }

    public void setC(int[][] A, int[] B) {
        this.C = new String[B.length];

        String angka, baris, kolom, kata, kata2;
        int data = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    if (A[i][j] == B[k]) {
                        if (C[k] != null && data != 0) {
                            angka = String.valueOf(B[k]);
                            baris = String.valueOf(i);
                            kolom = String.valueOf(j);
                            kata2 = C[k];
                            kata = C[k] + ", baris " + baris + " kolom " + kolom;
                            C[k] = kata;
                            data = 0;
                        } else if (data == 0) {
                            angka = String.valueOf(B[k]);
                            baris = String.valueOf(i);
                            kolom = String.valueOf(j);
                            kata = "Angka " + angka + " ditemukan pada baris " + baris + " kolom " + kolom;
                            C[k] = kata;
                            data++;
                        }
                    } else if (A[i][j] != B[k]) {
                        if (C[k] == null) {
                            angka = String.valueOf(B[k]);
                            baris = String.valueOf(i);
                            kolom = String.valueOf(j);
                            kata = "Angka " + angka + " tidak di temukan";
                            C[k] = kata;
                        }
                    }
                }
            }
        }
    }

    public void tampil(String a) {
        System.out.println(a);
    }

    public void tampil(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void tampil(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  \t");
            }
            System.out.println();
        }
    }

    public void tampil(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
