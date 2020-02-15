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
        
        equip.add(new Equipo ("Gryffindor", 12, 16, 0, 0, 0));
        jug.add(new Jugador ("Yuda", 5, "Gryffindor", 7));
        jug.add(new Jugador ("Camilo", 4, "Gryffindor", 3));
        jug.add(new Jugador ("Bendeck", 4, "Gryffindor", 2));
        jug.add(new Jugador ("Vargas", 1, "Gryffindor", 11));
        jug.add(new Jugador ("Sebas", 7, "Gryffindor", 19));
        jug.add(new Jugador ("Paulina", 7, "Gryffindor", 93));
        jug.add(new Jugador ("Diego", 5, "Gryffindor", 8));
        ((Equipo) equip.get(0)).setJugadores(jug);
        
        equip.add(new Equipo ("Slytherin", 10, 20, 0, 0, 0));
        jug.add(new Jugador ("Jamil", 5, "Slytherin", 4));
        jug.add(new Jugador ("Marcela", 3, "Slytherin", 10));
        jug.add(new Jugador ("Reyes", 3, "Slytherin", 9));
        jug.add(new Jugador ("Fortin", 2, "Slytherin", 15));
        jug.add(new Jugador ("James",6, "Slytherin", 16));
        jug.add(new Jugador ("Gabriel",6, "Slytherin", 13));
        jug.add(new Jugador ("Andrea",4, "Slytherin", 77));
        ((Equipo) equip.get(1)).setJugadores(jug);
        
                
        
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
                     try {
                        validarequipo(equip.get(e).getJugadores());
                    } catch (Excpet2 ep) {
                         System.out.println("Equipo no completo jugador 1");
                    }
                      try {
                        validarequipo(equip.get(cont).getJugadores());
                    } catch (Excpet2 ep) {
                         System.out.println("Equipo no completo en la maquina");
                    }
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
                        System.out.println("5) Salir");
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

                                            System.out.println(j.getNombre() + "-Guardian de la casa" + equip.get(e).getCasa() + "salvo la pelota de entrar");
                                        } else {
                                            System.out.println(j.getNombre() + "-Guardian de la casa" + equip.get(e).getCasa() + "fallo al tratar de slavar la pelota");
                                        }

                                    }
                                }
                                break;

                            case 2:
                                int ag2 = 0;
                                int vel2 = 0;
                                int def = 0;
                                for (Jugador j : equip.get(e).getJugadores()) {
                                    if (j instanceof Cazador) {
                                        ag2 = j.agilidad();
                                        vel2 = j.velocidadinicial();
                                    }
                                }
                                for (Jugador j : equip.get(cont).getJugadores()) {
                                    if (j instanceof Guardian) {
                                        def = j.agilidad();
                                    }
                                }
                                if (ag2 + vel2 >= def) {
                                    for (Jugador j : equip.get(cont).getJugadores()) {
                                        if (j instanceof Cazador) {
                                            ((Cazador) j).setVelocidad(vel2 + 6);
                                            ((Cazador) j).setAgilida(vel2 + 6);
                                            System.out.println(j.getNombre() + "-Cazador de la casa" + equip.get(e).getCasa() + "anoto un gol");
                                        } else {
                                            System.out.println(j.getNombre() + "-Cazador de la casa" + equip.get(e).getCasa() + "fallo al intentar anotar un gol");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                int ra = 1 + ran.nextInt(20);
                                int vel3 = 0;
                                int vel4 = 0;
                                int ag3 = 0;
                                for (Jugador j : equip.get(e).getJugadores()) {
                                    if (j instanceof Buscador) {
                                        vel3 = (j.velocidadinicial() / 14) + 14;
                                    }
                                }
                                for (Jugador j : equip.get(cont).getJugadores()) {
                                    if (j instanceof Buscador) {
                                        vel4 = j.velocidadinicial();
                                    }
                                }
                                if (vel3 > vel4) {
                                    for (Jugador j : equip.get(e).getJugadores()) {
                                        if (j instanceof Buscador) {
                                            ag3 = ((Buscador) j).getVelocidad();
                                            ((Buscador) j).setAgilida(ag3 + 1);
                                            System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "subio un punto en velocidad");
                                            if (ra > 18) {
                                                System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "atrapo la snitch");
                                            }
                                        } else {
                                            System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "no subio un punto a su velocidad");
                                        }
                                    }
                                }
                                if (ra > 18) {
                                    fin = false;
                                }
                                break;

                            case 4:
                                int fuer = 0;
                                int fuer2 = 0;
                                System.out.println("Desea defender o atacar");
                                System.out.println("1) Atacar");
                                System.out.println("2) Defender");
                                int op = jd.nextInt();
                                switch (op) {
                                    case 1:
                                        for (Jugador j : equip.get(e).getJugadores()) {
                                            if (j instanceof Golpeador) {
                                                fuer = ((Golpeador) j).getFuerz();
                                            }
                                        }
                                        for (Jugador j : equip.get(cont).getJugadores()) {
                                            if (j instanceof Golpeador) {
                                                fuer2 = ((Golpeador) j).getFuerz();
                                            }
                                        }
                                        if ((fuer * 2) + 1 > fuer2 + fuer2) {
                                            for (Jugador j : equip.get(e).getJugadores()) {
                                                if (j instanceof Golpeador) {
                                                    ((Golpeador) j).setFuerz(fuer + 10);
                                                    System.out.println(j.getNombre() + "-Golpeador de la casa" + equip.get(e).getCasa() + "logro atacar");
                                                } else {
                                                    System.out.println(j.getNombre() + "-Golpeador de la casa" + equip.get(e).getCasa() + "no logro atacar");
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        int agil = 0;
                                        int agil2 = 0;
                                        for (Jugador j : equip.get(e).getJugadores()) {
                                            if (j instanceof Golpeador) {
                                                agil = ((Golpeador) j).getFuerz();
                                            }
                                        }
                                        for (Jugador j : equip.get(cont).getJugadores()) {
                                            if (j instanceof Golpeador) {
                                                agil2 = ((Golpeador) j).getFuerz();
                                            }
                                        }
                                        if ((agil / 2) + 7 > agil2) {
                                            for (Jugador j : equip.get(e).getJugadores()) {
                                                if (j instanceof Golpeador) {
                                                    ((Golpeador) j).setAgilida(agil + 10);
                                                }
                                            }
                                            break;

                                        }
                                        break;
                                }
                                int juga2 = 1 + ran.nextInt(4);
                                switch (juga2) {
                                    case 1:
                                        int a = 0;
                                        int v = 0;
                                        for (Jugador j : equip.get(cont).getJugadores()) {
                                            if (j instanceof Guardian) {
                                                a = j.agilidad();
                                            }
                                        }
                                        for (Jugador j : equip.get(e).getJugadores()) {
                                            if (j instanceof Cazador) {
                                                v = j.velocidadinicial();
                                            }
                                        }
                                        if (a > v) {
                                            for (Jugador j : equip.get(e).getJugadores()) {
                                                if (j instanceof Guardian) {
                                                    ((Guardian) j).setAgilidad(a + 8);

                                                    System.out.println(j.getNombre() + "-Guardian de la casa" + equip.get(e).getCasa() + "salvo la pelota de entrar");
                                                } else {
                                                    System.out.println(j.getNombre() + "-Guardian de la casa" + equip.get(e).getCasa() + "fallo al tratar de slavar la pelota");
                                                }

                                            }
                                        }
                                        break;

                                    case 2:
                                        int a2 = 0;
                                        int v2 = 0;
                                        int d = 0;
                                        for (Jugador j : equip.get(cont).getJugadores()) {
                                            if (j instanceof Cazador) {
                                                a2 = j.agilidad();
                                                v2 = j.velocidadinicial();
                                            }
                                        }
                                        for (Jugador j : equip.get(e).getJugadores()) {
                                            if (j instanceof Guardian) {
                                                d = j.agilidad();
                                            }
                                        }
                                        if (a2 + v2 >= d) {
                                            for (Jugador j : equip.get(cont).getJugadores()) {
                                                if (j instanceof Cazador) {
                                                    ((Cazador) j).setVelocidad(v2 + 6);
                                                    ((Cazador) j).setAgilida(a2 + 6);
                                                    System.out.println(j.getNombre() + "-Cazador de la casa" + equip.get(e).getCasa() + "anoto un gol");
                                                } else {
                                                    System.out.println(j.getNombre() + "-Cazador de la casa" + equip.get(e).getCasa() + "fallo al intentar anotar un gol");
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        int r = 1 + ran.nextInt(20);
                                        int v3 = 0;
                                        int v4 = 0;
                                        int a3 = 0;
                                        for (Jugador j : equip.get(cont).getJugadores()) {
                                            if (j instanceof Buscador) {
                                                v3 = (j.velocidadinicial() / 14) + 14;
                                            }
                                        }
                                        for (Jugador j : equip.get(e).getJugadores()) {
                                            if (j instanceof Buscador) {
                                                v4 = j.velocidadinicial();
                                            }
                                        }
                                        if (v3 > v4) {
                                            for (Jugador j : equip.get(cont).getJugadores()) {
                                                if (j instanceof Buscador) {
                                                    ag3 = ((Buscador) j).getVelocidad();
                                                    ((Buscador) j).setAgilida(ag3 + 1);
                                                    System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "subio un punto en velocidad");
                                                    if (r > 18) {
                                                        System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "atrapo la snitch");
                                                    }
                                                } else {
                                                    System.out.println(j.getNombre() + "-Buscador de la casa" + equip.get(e).getCasa() + "no subio un punto a su velocidad");
                                                }
                                            }
                                        }
                                        if (r > 18) {
                                            fin = false;
                                        }
                                        break;

                                    case 4:
                                        int f = 0;
                                        int f2 = 0;
                                        int n = 1 + ran.nextInt(2);
                                        switch (n) {
                                            case 1:
                                                for (Jugador j : equip.get(cont).getJugadores()) {
                                                    if (j instanceof Golpeador) {
                                                        f = ((Golpeador) j).getFuerz();
                                                    }
                                                }
                                                for (Jugador j : equip.get(e).getJugadores()) {
                                                    if (j instanceof Golpeador) {
                                                        f2 = ((Golpeador) j).getFuerz();
                                                    }
                                                }
                                                if ((fuer * 2) + 1 > fuer2 + fuer2) {
                                                    for (Jugador j : equip.get(cont).getJugadores()) {
                                                        if (j instanceof Golpeador) {
                                                            ((Golpeador) j).setFuerz(f + 10);
                                                            System.out.println(j.getNombre() + "-Golpeador de la casa" + equip.get(e).getCasa() + "logro atacar");
                                                        } else {
                                                            System.out.println(j.getNombre() + "-Golpeador de la casa" + equip.get(e).getCasa() + "no logro atacar");
                                                        }
                                                    }
                                                }
                                                break;
                                            case 2:
                                                int agi = 0;
                                                int agi2 = 0;
                                                for (Jugador j : equip.get(cont).getJugadores()) {
                                                    if (j instanceof Golpeador) {
                                                        agi = ((Golpeador) j).getFuerz();
                                                    }
                                                }
                                                for (Jugador j : equip.get(e).getJugadores()) {
                                                    if (j instanceof Golpeador) {
                                                        agi2 = ((Golpeador) j).getFuerz();
                                                    }
                                                }
                                                if ((agi / 2) + 7 > agi2) {
                                                    for (Jugador j : equip.get(cont).getJugadores()) {
                                                        if (j instanceof Golpeador) {
                                                            ((Golpeador) j).setAgilida(agi + 10);
                                                        }
                                                    }
                                                    break;

                                                }
                                                break;
                                        }
                                    case 5:
                                        fin = false;
                                        break;

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
    }

    public static void validarCasa(String Casa) throws Exception1 {
        if (!Casa.equals("Gryffindor") || !Casa.equals("Slytherin") || !Casa.equals("Ravenclaw") || !Casa.equals("Hufflepuff")) {
            throw new Exception1();
            
        }
    }
    public static void validarequipo(ArrayList e) throws Excpet2{
    if(e.size()>=8){
       throw new Excpet2(); 
       }
        }

}
