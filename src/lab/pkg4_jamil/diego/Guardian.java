/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jamil.diego;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Guardian extends Jugador {
    Random random = new Random();
    private int reflejos;
    private int agilidad;

    public Guardian() {
        super();
    }

    public Guardian(int reflejos, int agilidad, String nombre, int año, String casa, int num_uniforme) {
        super(nombre, año, casa, num_uniforme);
        this.reflejos = reflejos;
        this.agilidad = agilidad;
    }
    
    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = reflejos+7;
    }

    @Override
    public String toString() {
        return super.toString() + "Guardian: \n" + 
                "Reflejos: " + reflejos + "\n" +
                "Agilidad: " + agilidad;
    }

    public int agilidad(){
    return agilidad;
    }
        public boolean trampa() {
        boolean barrera = true;
        int d = 1 + random.nextInt(100);
        if (d <= 22) {
            return barrera;
        } else {
            barrera = false;
            return barrera;
        }
    }
    
}
