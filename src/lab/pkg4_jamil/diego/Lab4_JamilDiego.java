package lab.pkg4_jamil.diego;

import java.util.Scanner;

public class Lab4_JamilDiego {
    
    static Scanner jd = new Scanner(System.in);

    public static void main(String[] args) {
        
        char resp = 's';
        
        while (resp == 's'){
            System.out.println(""
                    + "________________________________"
                    + "|            Menu:             |"
                    + "|______________________________|"
                    + "| 1. CRUD EQUIPOS              |"
                    + "| 2. CRUD JUGADORES            |"
                    + "| 3. SIMULACION DEL JUEGO      |"
                    + "|______________________________|"
                    + ""
                    + "Ingrese Una Opcion: ");
            int opcion = jd.nextInt();
            
            
        }
        
    }
    
}
