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
public class ConsPersegiPanjangChild extends ConsPersegiPanjangParent{ 
    private int lebar, luasPersegi, luas;
    
    protected ConsPersegiPanjangChild(int panjang, int sisi, int lebar) {
        super(panjang, sisi);
        this.lebar = lebar;
        setLuas();
        setLuasPersegi();
    }

    protected int getLebar() {
        return lebar;
    }
    
    protected int getLuas() {
        return luas;
    }

    protected void setLuas() {
        this.luas = super.getPanjang() * getLebar();
    }

    public int getLuasPersegi() {
        return luasPersegi;
    }

    public void setLuasPersegi() {
        this.luasPersegi = getSisi() * getSisi();
    }
    
    
}
