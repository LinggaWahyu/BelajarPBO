/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author equinox
 */
public class ConsPersegiChild extends ConsPersegiParent {
    private int luas, luasPP;

    protected ConsPersegiChild(int sisi, int panjang, int lebar) {
        super(sisi, panjang, lebar);
        setLuas();
        setLuasPP();
    }
    
    protected int getLuas() {
        return luas;
    }

    protected void setLuas() {
        this.luas = getSisi() * getSisi();
    }

    public int getLuasPP() {
        return luasPP;
    }

    public void setLuasPP() {
        this.luasPP = getPanjang() * getLebar();
    }
}
