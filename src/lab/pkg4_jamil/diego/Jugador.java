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
public class Jugador {
    private String nombre;
    private int año;
    private String casa;
    private int num_uniforme;

    public Jugador() {
    }

  
    public Jugador(String nombre, int año, String casa, int num_uniforme) {
        this.nombre = nombre;
        this.año = año;
        this.casa = casa;
        this.num_uniforme = num_uniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getNum_uniforme() {
        return num_uniforme;
    }

    public void setNum_uniforme(int num_uniforme) {
        this.num_uniforme = num_uniforme;
    }

    @Override
    public String toString() {
        return  "Jugador: \n" + 
                "Nombre: " + nombre + "\n" + 
                "A\u00f1o: " + año + "\n" +
                "Casa: " + casa + "\n" +
                "Num_uniforme: " + num_uniforme;
    }
    public boolean trampa(){
    return true;
    } 
    
    public int velocidadinicial(){
    return 0;
    }
     public int agilidad(){
    return 0;
    }
      public int fuerza(){
    return 0;
    }
}
