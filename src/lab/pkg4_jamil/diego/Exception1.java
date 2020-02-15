/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jamil.diego;

/**
 *
 * @author JamilGarcía
 */
public class Exception1 extends Exception{
    private String Casa;

    public Exception1() {
        super();
    }

    public Exception1(String Casa) {
        this.Casa = Casa;
    }

    public String getCasa() {
        return Casa;
    }

    public void setCasa(String Casa) {
        this.Casa = Casa;
    }

    @Override
    public String toString() {
        return "Exception1{" + "Casa=" + Casa + '}';
    }
    
    
}
