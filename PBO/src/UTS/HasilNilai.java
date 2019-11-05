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
public class HasilNilai extends ProsesNilai {
    private HasilNilai(String[][] LJU, String[] Kunci) {
        super(LJU, Kunci);
    }
    
    public static void main(String[] args) {
        String[][] LJU = {{"P123","C"," ","A","D"," "},
                          {"P456","D","B","B"," ","C"},
                          {"P789","D","E","A","B","C"},
                          {"P234","D","E","D","B"," "}};
        String[] Kunci = {"D","E","A","B","C"};
        
        ProsesNilai ob = new ProsesNilai(LJU, Kunci);
        
        ob.tampil("\nLembar Jawab Ujian : \n");
        ob.tampil(LJU);
        ob.tampil("\nKunci Jawaban : \n");
        ob.tampil(Kunci);
        ob.tampil("\n\nHasil Penilaian LJU: \n");
        ob.tampil(ob.getNilai());
    }
}
