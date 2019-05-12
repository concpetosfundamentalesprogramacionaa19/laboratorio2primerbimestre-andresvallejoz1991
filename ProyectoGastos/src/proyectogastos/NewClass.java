/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogastos;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String mensajeFinal = "";
        String nombre;
        String apellido;
        String profesion;
        String opcion = "";
        int contador = 1;
        boolean bandera = true;
        
        mensajeFinal = String.format("%s%s", mensajeFinal, 
        "Informe ciudad de Loja\n\n");
        mensajeFinal = String.format("%s%s", mensajeFinal, 
        "Listado de personas\n\n");
        
        while (bandera == true){
           System.out.println("Ingrese su nombre"); 
           nombre = sc.nextLine();
           System.out.println("Ingrese su apellido"
                   + ""); 
           apellido = sc.nextLine();
           System.out.println("Ingrese su profesion"); 
           profesion = sc.nextLine();
           
           mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                   mensajeFinal,contador, nombre, apellido, profesion);
        
            contador = contador+1; // que el contador se incremente
            System.out.println("Digite ´n´ para salir");
            opcion = sc.nextLine();
            if (opcion.equals("n")){
                bandera = false;
            }
        }
       System.out.printf("%s", mensajeFinal);
    }
    
}
