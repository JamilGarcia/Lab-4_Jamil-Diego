/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jamil.diego;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Excpet2 extends Exception{
    private ArrayList e=new ArrayList();
    public Excpet2() {
    super();
    }

    public ArrayList getE() {
        return e;
    }

    public void setE(ArrayList e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Excpet2{" + "e=" + e + '}';
    }

    void setStackTrace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
