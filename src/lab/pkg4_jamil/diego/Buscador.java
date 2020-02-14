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
public class Buscador extends Jugador{
private int peso;
private int musculatura;
private int reflejos;

    public Buscador(int peso, int musculatura, int reflejos, String nombre, int año, String casa, int num_uniforme) {
        super(nombre, año, casa, num_uniforme);
        this.peso = peso;
        this.musculatura = musculatura;
        this.reflejos = reflejos;
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
     public int velocidadinicial(){
    return (200/peso)*7;
    }
     public int agilidad(){
    return reflejos +7;
    }
      public int fuerza(){
    return (musculatura*2)-7;
    }
    
}
