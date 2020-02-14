package lab.pkg4_jamil.diego;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_JamilDiego {

    static Scanner jd = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {

        char resp = 's';

        ArrayList <Jugador> jug = new ArrayList();
        ArrayList <Equipo> equip = new ArrayList();
        
        while (resp == 's'){

            System.out.println(""
                    + "________________________________ \n"
                    + "|            Menu:             |\n"
                    + "|______________________________|\n"
                    + "| 1. CRUD EQUIPOS              |\n"
                    + "| 2. CRUD JUGADORES            |\n"
                    + "| 3. SIMULACION DEL JUEGO      |\n"
                    + "| 0. SALIR                     |\n"
                    + "|______________________________|\n"
                    + "\n"
                    + "Ingrese Una Opcion: ");
            int opcion = jd.nextInt();

            switch (opcion) {
                case 1: //CRUD Equipos
                    System.out.println(""
                            + "_______________________\n"
                            + "|  CRUD EQUIPOS       |\n"
                            + "|_____________________|\n"
                            + "| 1. AGREGAR EQUIPO   |\n"
                            + "| 2. MODIFICAR EQUIPO |\n"
                            + "| 3. LISTAR EQUIPO    |\n"
                            + "|_____________________|\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcion1 = jd.nextInt();

                    switch (opcion1) {
                        case 1: //Agregar Equipo

                            System.out.println("Ingrese la casa del equipo: ");
                            String casa = jd.next();
                            
                            System.out.println("Ingrese los partidos perdidos: ");
                            int parPer = jd.nextInt();
                            
                            System.out.println("Ingrese los partidos ganados: ");
                            int parGan = jd.nextInt();
                            
                            double agil = 0;
                            double Vel = 0;
                            double Fuer = 0;
                            
                            Equipo eq = new Equipo(casa, parPer, parGan, agil, Vel, Fuer);
                            
                            equip.add(new Equipo(casa, parPer, parGan, agil, Vel, Fuer));
                            
                            
                            break;
                        case 2: //Modificar Equipo
                            System.out.println("Ingrese el numero de equipo: ");
                            int setEquip = jd.nextInt();
                            
                            System.out.println(""
                                    + "________________________\n"
                                    + "|       Modificar      |\n"
                                    + "|______________________|\n"
                                    + "| 1. Casa              |\n"
                                    + "| 2. Partidos Perdidos |\n"
                                    + "| 3. Partidos Ganados  |\n"
                                    + "|______________________|\n"
                                    + "\n"
                                    + "Ingrese la opcon: ");
                            int opcion12 = jd.nextInt();
                            
                            switch (opcion12) {
                                case 1:
                                    System.out.println("Ingrese la casa: ");
                                    casa = jd.next();
                                    
                                    ((Equipo) equip.get(setEquip)).setCasa(casa);
                                    
                                    break;
                                case 2:
                                    System.out.println("Ingrese los partidos perdidos: ");
                                    parPer = jd.nextInt();
                                    
                                    ((Equipo) equip.get(setEquip)).setPerdidos(parPer);
                                    
                                    break;
                                case 3:
                                    System.out.println("Ingrese los partidos ganados: ");
                                    parGan = jd.nextInt();
                                    
                                    ((Equipo) equip.get(setEquip)).setGanados(parGan);
                                    
                                    break;
                                default:
                                    System.out.println("Error!!! Opcion Incorrecta!!");
                            }
                            
                            
                            break;
                        case 3: //Listar Equipo
                            
                            
                            

                            break;
                        default:
                            System.out.println("Error!!! Valor Incorrecto!!!");
                    }
                    break;

                case 2: //CRUD Jugadores
                    System.out.println(""
                            + "_______________________\n"
                            + "|  CRUD JUGADOR       |\n"
                            + "|_____________________|\n"
                            + "| 1. AGREGAR JUGADOR  |\n"
                            + "| 2. MODIFICAR JUGADOR|\n"
                            + "| 3. LISTAR JUGADORES |\n"
                            + "|_____________________|\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcion2 = jd.nextInt();

                    switch (opcion2) {
                        case 1: //Agregar Jugador

                            break;
                        case 2: //Modificar Jugador

                            break;
                        case 3: //Listar Jugadores

                            break;
                        default:
                            System.out.println("Error!!! Valor Incorrecto!!!");
                    }

                    break;

                case 3: //Simulacion
                    boolean fin = true;
                    
                    while (fin) {
                        System.out.println("Es tu turno jugador 1 con que jugador desea jugar:");
                        System.out.println("1) Guardian");
                        System.out.println("2) Buscador");
                        System.out.println("3) Cazador");
                        System.out.println("4) Golpeador");
                        int juga = jd.nextInt();
                        switch (juga) {
                            case 1:
                                
                                break;
                            case 2:
                                break;
                            case 3: 
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;

                case 0: //Salida
                    System.out.println("Gracias por utilizar el programa <3");
                    System.exit(0);
                    break;
                default: //Validacion
                    System.out.println("Error!! Opcion Incorrecta!!!");
            }

        }

    }

}
