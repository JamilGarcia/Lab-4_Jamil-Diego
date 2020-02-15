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
public class Buscador extends Jugador {

    Random random = new Random();
    private int peso;
    private int musculatura;
    private int reflejos;
    private int velocidad;
    private int agilida;
    private int fuerz;

    public Buscador(int peso, int musculatura, int reflejos, String nombre, int año, String casa, int num_uniforme) {
        super(nombre, año, casa, num_uniforme);
        this.peso = peso;
        this.musculatura = musculatura;
        this.reflejos = reflejos;
        fuerz = (this.musculatura * 2) - 7;
        velocidad = (200 / this.peso) * 7;
        agilida = this.reflejos + 7;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAgilida() {
        return agilida;
    }

    public void setAgilida(int agilida) {
        this.agilida = agilida;
    }

    public int getFuerz() {
        return fuerz;
    }

    public void setFuerz(int fuerz) {
        this.fuerz = fuerz;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + ", musculatura=" + musculatura + ", reflejos=" + reflejos + '}';
    }

    public int velocidadinicial() {
        return velocidad;
    }

    public int agilidad() {
        return agilida;
    }

    public int fuerza() {
        return fuerz;
    }

    public boolean trampa() {
        boolean snitch = true;
        int d = 1 + random.nextInt(100);
        if (d <= 5) {
            return snitch;
        } else {
            snitch = false;
            return snitch;
        }
    }

}
