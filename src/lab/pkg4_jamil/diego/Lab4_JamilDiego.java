package lab.pkg4_jamil.diego;

import java.util.Scanner;

public class Lab4_JamilDiego {

    static Scanner jd = new Scanner(System.in);

    public static void main(String[] args) {

        char resp = 's';

        while (resp == 's') {
            System.out.println(""
                    + "________________________________"
                    + "|            Menu:             |"
                    + "|______________________________|"
                    + "| 1. CRUD EQUIPOS              |"
                    + "| 2. CRUD JUGADORES            |"
                    + "| 3. SIMULACION DEL JUEGO      |"
                    + "| 0. SALIR                     |"
                    + "|______________________________|"
                    + ""
                    + "Ingrese Una Opcion: ");
            int opcion = jd.nextInt();

            switch (opcion) {
                case 1: //CRUD Equipos
                    System.out.println(""
                            + "_______________________"
                            + "|  CRUD EQUIPOS       |"
                            + "|_____________________|"
                            + "| 1. AGREGAR EQUIPO   |"
                            + "| 2. MODIFICAR EQUIPO |"
                            + "| 3. LISTAR EQUIPO    |"
                            + "|_____________________|"
                            + "Ingrese una opcion: ");
                    int opcion1 = jd.nextInt();

                    switch (opcion1) {
                        case 1: //Agregar Equipo

                            break;
                        case 2: //Modificar Equipo

                            break;
                        case 3: //Listar Equipo

                            break;
                        default:
                            System.out.println("Error!!! Valor Incorrecto!!!");
                    }
                    break;

                case 2: //CRUD Jugadores
                    System.out.println(""
                            + "_______________________"
                            + "|  CRUD EQUIPOS       |"
                            + "|_____________________|"
                            + "| 1. AGREGAR JUGADOR  |"
                            + "| 2. MODIFICAR JUGADOR|"
                            + "| 3. LISTAR JUGADORES |"
                            + "|_____________________|"
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
                        int jug = jd.nextInt();
                        switch (jug) {
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
