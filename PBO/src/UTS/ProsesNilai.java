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
public class ProsesNilai extends Data {
    protected String[][] Nilai;
    
     protected ProsesNilai(String[][] LJU, String[] Kunci) {
         super(LJU, Kunci);
         setNilai(LJU, Kunci);
     }
     
     protected void setNilai(String[][] LJU, String[] Kunci) {
         
         Nilai = new String[LJU.length][3];
        
         int point;
         double nilai;
         String jmlpoint, nilaiakhir;
         for (int i = 0; i < LJU.length; i++) {
             point = 0;
             for (int j = 1; j < LJU[i].length; j++) {
                 if (LJU[i][j].equals(Kunci[j-1])) {
                     point += 3;
                 } else if (!LJU[i][j].equals(Kunci[j-1]) ) {
                     if (LJU[i][j].equals(" ")) {
                         point += 0;
                     } else {
                        point -= 1; 
                     }
                 }
                 jmlpoint = String.valueOf(point);
                 nilai = Double.valueOf(point * 100) / Double.valueOf(Kunci.length * 3);
                 nilaiakhir = String.valueOf(nilai);
                 Nilai[i][0] = LJU[i][0];
                 Nilai[i][1] = jmlpoint;
                 Nilai[i][2] = nilaiakhir;
             }
         }
     }
     
     protected String[][] getNilai() {
         return Nilai;
     }
}
