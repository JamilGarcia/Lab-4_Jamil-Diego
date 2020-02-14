/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jamil.diego;

/**
 *
 * @author diego
 */
public class Guardian extends Jugador {
private int reflejos;

    public Guardian(int reflejos, String nombre, int año, String casa, int num_uniforme) {
        super(nombre, año, casa, num_uniforme);
        this.reflejos = reflejos;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejos=" + reflejos + '}';
    }

    public int agilidad(){
    return reflejos+7;
    }
    
}
