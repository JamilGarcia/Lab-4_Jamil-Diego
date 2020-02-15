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
                            String Casa = jd.next();
                            
                            while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
                                    }

                            System.out.println("Ingrese los partidos perdidos: ");
                            int parPer = jd.nextInt();

                            System.out.println("Ingrese los partidos ganados: ");
                            int parGan = jd.nextInt();

                            double agil = 0;
                            double Vel = 0;
                            double Fuer = 0;

                            Equipo eq = new Equipo(Casa, parPer, parGan, agil, Vel, Fuer);

                            equip.add(new Equipo(Casa, parPer, parGan, agil, Vel, Fuer));

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
                                    Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
                                    }
                                    
                                    ((Equipo) equip.get(setEquip)).setCasa(Casa);

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
                            + "| 4. ELIMINAR JUGADOR |\n"
                            + "|_____________________|\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcion2 = jd.nextInt();

                    switch (opcion2) {
                        case 1: //Agregar Jugador
                            System.out.println(""
                                    + "Ingrese El tipo de jugador:\n "
                                    + "___________________________\n"
                                    + " 1. Guardian\n"
                                    + " 2. Cazador\n"
                                    + " 3. Buscador\n"
                                    + " 4. Golpeador\n "
                                    + "___________________________\n");
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
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
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
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
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
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
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
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
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
                                    System.out.println("Error!!! Opcion Incorrecta!!!");
                            }

                            break;
                        case 2: //Modificar Jugador
                            for (int i = 0; i < jug.size(); i++) {
                                System.out.println(i + ". " + equip.get(i));
                            }
                            System.out.println("Ingrese el equipo a modificar: ");
                            int p = jd.nextInt();

                            System.out.println("Ingrese el jugador a modificar: ");
                            int jugad = jd.nextInt();

                            System.out.println(""
                                    + "Modificar: \n"
                                    + "______________________________\n"
                                    + "1. Nombre\n"
                                    + "2. Años\n"
                                    + "3. Casa\n"
                                    + "4. Numero De Uniforme\n");
                            int opcion13 = jd.nextInt();
                            switch (opcion13) {
                                case 1:
                                    System.out.println("Nombre: ");
                                    String nom = jd.nextLine();
                                    nom = jd.nextLine();

                                    jug.get(jugad).setNombre(nom);
                                    ((Equipo) equip.get(p)).setJugadores(jug);

                                    break;
                                case 2:
                                    System.out.println("Años");
                                    int anios = jd.nextInt();

                                    jug.get(jugad).setAño(anios);
                                    ((Equipo) equip.get(p)).setJugadores(jug);

                                    break;
                                case 3:
                                    System.out.println("Casa: ");
                                    String Casa = jd.next();

                                    while (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
                                        //Try Catch
                                        try {
                                            validarCasa(Casa);
                                        } catch (Exception1 e) {
                                            System.out.println("Casa no valida");
                                            Casa = jd.next();
                                        }
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

                                    jug.get(jugad).setCasa(Casa);
                                    ((Equipo) equip.get(p)).setJugadores(jug);

                                    break;
                                case 4:
                                    System.out.println("Numero De Uniforme: ");
                                    int n_uniforme = jd.nextInt();

                                    jug.get(jugad).setNum_uniforme(n_uniforme);
                                    ((Equipo) equip.get(p)).setJugadores(jug);

                                    break;
                                default:
                                    System.out.println("Error!!! Opcion Incorrecto!!!");
                            }
                            break;
                        case 3: //Listar Jugadores
                            for (int i = 0; i < jug.size(); i++) {
                                System.out.println(i + ". " + equip.get(i));
                            }

                            break;

                        case 4:
                            for (int i = 0; i < jug.size(); i++) {
                                System.out.println(i + ". " + equip.get(i));
                            }
                            System.out.println("Ingrese el equipo: ");
                            int f = jd.nextInt();

                            System.out.println("Ingrese el jugador a eliminar");
                            int elim = jd.nextInt();

                            jug.remove(elim);
                            ((Equipo) equip.get(f)).setJugadores(jug);

                            break;
                        default:
                            System.out.println("Error!!! Valor Incorrecto!!!");
                    }

                    break;

                case 3: //Simulacion
                    boolean fin = true;
                    for (int i = 0; i < equip.size(); i++) {
                        System.out.println(equip.get(i));
                    }
                    System.out.println("Con que equipo deseas jugar?");
                    int e = jd.nextInt();
                    System.out.println("Elige el equipo contrario:");
                    int cont = jd.nextInt();
                    while (fin) {
                        for (int i = 0; i < jug.size(); i++) {
                            System.out.println(jug.get(i));
                        }
                        System.out.println("Es tu turno jugador 1 con que jugador desea jugar:");
                        int juga = jd.nextInt();
                        System.out.println("1) Guardian");
                        System.out.println("2) Cazador");
                        System.out.println("3) Buscador");
                        System.out.println("4) Golpeador");
                        switch (juga) {
                            case 1:
                                int ag = 0;
                                int vel = 0;
                                for (Jugador j : equip.get(e).getJugadores()) {
                                    if (j instanceof Guardian) {
                                        ag = j.agilidad();
                                    }
                                }
                                for (Jugador j : equip.get(cont).getJugadores()) {
                                    if (j instanceof Cazador) {
                                        vel = j.velocidadinicial();
                                    }
                                }
                                if (ag > vel) {
                                    for (Jugador j : equip.get(e).getJugadores()) {
                                        if (j instanceof Guardian) {
                                            ((Guardian) j).setAgilidad(ag + 8);
                                        }
                                    }
                                    System.out.println(equip);
                                }

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
    
    public static void validarCasa(String Casa) throws Exception1{
        if (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")){
            throw new Exception1();
            
        }
    }

}
