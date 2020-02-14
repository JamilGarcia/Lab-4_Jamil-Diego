package lab.pkg4_jamil.diego;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_JamilDiego {

    static Scanner jd = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {

        char resp = 's';

        ArrayList<Jugador> jug = new ArrayList();
        ArrayList<Equipo> equip = new ArrayList();

        while (resp == 's') {

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
                            for (int i = 0; i < equip.size(); i++) {
                                System.out.println(i + ". " + equip.get(i));
                            }
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
                            for (int i = 0; i < equip.size(); i++) {
                                System.out.println(i + ". " + equip.get(i));
                            }
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
                            System.out.println(""
                                    + "Ingrese El tipo de jugador: "
                                    + "___________________________"
                                    + " 1. Guardian"
                                    + " 2. Cazador"
                                    + " 3. Buscador"
                                    + " 4. Golpeador "
                                    + "___________________________");
                            int pos = jd.nextInt();
                            switch (pos) {
                                case 1:
                                    System.out.println("Nombre:");
                                    String nom = jd.nextLine();
                                    nom = jd.nextLine();

                                    System.out.println("Años: ");
                                    int anios = jd.nextInt();

                                    System.out.println("Casa: ");
                                    String Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch

                                    }

                                    int c = 0;
                                    if (Casa.equals("Gryffindor")) {
                                        c = 0;
                                    } else if (Casa.equals("Slytherin")) {
                                        c = 1;
                                    } else if (Casa.equals("Ravenclaw")) {
                                        c = 2;
                                    } else if (Casa.equals("Hufflepuff")) {
                                        c = 3;
                                    }

                                    System.out.println("Numero de uniforme: ");
                                    int n_uniforme = jd.nextInt();

                                    System.out.println("Reflejos: ");
                                    int reflex = jd.nextInt();

                                    jug.add(new Guardian(reflex, nom, anios, Casa, n_uniforme));
                                    ((Equipo) equip.get(c)).setJugadores(jug);
                                    break;
                                    
                                case 2: 
                                    System.out.println("Nombre:");
                                    nom = jd.nextLine();
                                    nom = jd.nextLine();

                                    System.out.println("Años: ");
                                    anios = jd.nextInt();

                                    System.out.println("Casa: ");
                                    Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch

                                    }

                                    c = 0;
                                    if (Casa.equals("Gryffindor")) {
                                        c = 0;
                                    } else if (Casa.equals("Slytherin")) {
                                        c = 1;
                                    } else if (Casa.equals("Ravenclaw")) {
                                        c = 2;
                                    } else if (Casa.equals("Hufflepuff")) {
                                        c = 3;
                                    }

                                    System.out.println("Numero de uniforme: ");
                                    n_uniforme = jd.nextInt();
                                    
                                    System.out.println("Reflejos: ");
                                    reflex = jd.nextInt();
                                    
                                    System.out.println("Peso: ");
                                    int peso = jd.nextInt();
                                    
                                    System.out.println("Musculatura: ");
                                    int musc = jd.nextInt();

                                    jug.add(new Cazador(peso, musc, reflex, nom, anios, Casa, n_uniforme));
                                    ((Equipo) equip.get(c)).setJugadores(jug);
                                    
                                    break;
                                 
                                case 3:
                                    System.out.println("Nombre:");
                                    nom = jd.nextLine();
                                    nom = jd.nextLine();

                                    System.out.println("Años: ");
                                    anios = jd.nextInt();

                                    System.out.println("Casa: ");
                                    Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch

                                    }

                                    c = 0;
                                    if (Casa.equals("Gryffindor")) {
                                        c = 0;
                                    } else if (Casa.equals("Slytherin")) {
                                        c = 1;
                                    } else if (Casa.equals("Ravenclaw")) {
                                        c = 2;
                                    } else if (Casa.equals("Hufflepuff")) {
                                        c = 3;
                                    }

                                    System.out.println("Numero de uniforme: ");
                                    n_uniforme = jd.nextInt();
                                    
                                    System.out.println("Reflejos: ");
                                    reflex = jd.nextInt();
                                    
                                    System.out.println("Peso: ");
                                    peso = jd.nextInt();
                                    
                                    System.out.println("Musculatura: ");
                                    musc = jd.nextInt();

                                    jug.add(new Buscador(peso, musc, reflex, nom, anios, Casa, n_uniforme));
                                    ((Equipo) equip.get(c)).setJugadores(jug);
                                    
                                    break; 
                                case 4: 
                                    System.out.println("Nombre:");
                                    nom = jd.nextLine();
                                    nom = jd.nextLine();

                                    System.out.println("Años: ");
                                    anios = jd.nextInt();

                                    System.out.println("Casa: ");
                                    Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch

                                    }

                                    c = 0;
                                    if (Casa.equals("Gryffindor")) {
                                        c = 0;
                                    } else if (Casa.equals("Slytherin")) {
                                        c = 1;
                                    } else if (Casa.equals("Ravenclaw")) {
                                        c = 2;
                                    } else if (Casa.equals("Hufflepuff")) {
                                        c = 3;
                                    }

                                    System.out.println("Numero de uniforme: ");
                                    n_uniforme = jd.nextInt();
                                    
                                    System.out.println("Reflejos: ");
                                    reflex = jd.nextInt();
                                    
                                    System.out.println("Peso: ");
                                    peso = jd.nextInt();
                                    
                                    System.out.println("Musculatura: ");
                                    musc = jd.nextInt();

                                    jug.add(new Golpeador(peso, musc, reflex, nom, anios, Casa, n_uniforme));
                                    ((Equipo) equip.get(c)).setJugadores(jug);
                                    break;
                                default:
                                    throw new AssertionError();
                            }

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
