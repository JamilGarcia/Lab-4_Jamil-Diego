package lab.pkg4_jamil.diego;

import java.util.ArrayList;

public class Equipo {
    
    private String casa;
    private int perdidos;
    private int ganados;
    private double agilidad;
    private double velocidad;
    private double fuerza;
    private ArrayList<Jugador>jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String casa, int perdidos, int ganados, double agilidad, double velocidad, double fuerza) {
        this.casa = casa;
        this.perdidos = perdidos;
        this.ganados = ganados;
        this.agilidad = agilidad;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
    }

   

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
       if(agilidad<100){
        this.agilidad = agilidad;
       }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad<100){
        this.velocidad = velocidad;
        }
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if(fuerza<100){
        this.fuerza = fuerza;
        }
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo: \n"+ 
                "| Casa: " + casa + "\n" + 
                "| Perdidos: " + perdidos + 
                "| Ganados: " + ganados + "Agilidad=" + agilidad + ", velocidad=" + velocidad + ", fuerza=" + fuerza + ", jugadores=" + jugadores + '}';
    }
    
    
}
