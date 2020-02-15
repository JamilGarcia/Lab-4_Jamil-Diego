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
public class Jugador {
    
    private String nombre;
    private int año;
    private String casa;
    private int num_uniforme;
    private ArrayList <Guardian> guar = new ArrayList();
    private ArrayList <Golpeador> golp = new ArrayList();
    private ArrayList <Cazador> caza = new ArrayList();
    private ArrayList <Buscador> busc = new ArrayList();

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

    public ArrayList<Guardian> getGuar() {
        return guar;
    }

    public void setGuar(ArrayList<Guardian> guar) {
        this.guar = guar;
    }

    public ArrayList<Golpeador> getGolp() {
        return golp;
    }

    public void setGolp(ArrayList<Golpeador> golp) {
        this.golp = golp;
    }

    public ArrayList<Cazador> getCaza() {
        return caza;
    }

    public void setCaza(ArrayList<Cazador> caza) {
        this.caza = caza;
    }

    public ArrayList<Buscador> getBusc() {
        return busc;
    }

    public void setBusc(ArrayList<Buscador> busc) {
        this.busc = busc;
    }

    @Override
    public String toString() {
        return "Jugador: " + 
                "Nombre: " + nombre + "\n" +
                "A\u00f1o: " + año + "\n" +
                "Casa: " + casa + "\n" +
                "Uniforme: " + num_uniforme + "\n" + 
                "Guardian: " + guar + "\n" +
                "Golpeador: " + golp + "\n" +
                "Caza: " + caza + "\n" +
                "Buscador: " + busc + "\n" +
                "\n";
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
