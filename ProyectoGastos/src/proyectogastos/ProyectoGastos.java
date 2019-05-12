/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogastos;
import java.util.Scanner; //Importacion del Scanner
/**
 *
 * @author Andrés
 */
public class ProyectoGastos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Clase
        Scanner sc = new Scanner (System.in);
        String nombre; //Variable nombre del Padre
        String mensajef=""; //Variable mensaje Final
        String opcion; //Variable para la salida 
        
        int sueldo; //Variable del sueldo del padre
        int n; //Variable de numero de hijos
        int i; //Contador
        boolean bandera = true; //Bandera
        float pas;//Variable valor del pasaje
        float bar;//Varaible del gasto en un bar
        float sal; //Variable del gasto en salidas
       
    
    while (bandera == true ){
        i = 1;//El contador vuelve al valor inicial
         System.out.println("Ingrese nombres del padre de familia");
    nombre = sc.nextLine(); //Ingreso del nombre del padre de familia
  
    System.out.println("Ingrese sueldo semanal");
    sueldo = sc.nextInt(); //Ingreso del sueldo semanal
    
    System.out.println("Ingrese numero de hijos ");
    n = sc.nextInt(); //Ingreso del numero de hijos
    
        while (i<=n){
        System.out.println("Ingrese el gasto semanal en pasajes");
        pas = sc.nextFloat(); //Ingreso gasto semanal
        System.out.println("Ingrese el gasto semanal en bar");
        bar = sc.nextFloat(); //Ingreso gasto en bar
        System.out.println("Ingrese el gasto semanal en salidas");
        sal = sc.nextFloat();//Ingreso gasto en salidas
        
       mensajef= String.format("%sHijo        %f1         %f1           %f1\n", 
                   mensajef,pas, bar, sal); //Impresion mensaje final
         i = i+1; //Incremento del contador
         
        }
       //Sistema para salir del bucle o continuar en el 
        System.out.println("Digite ´n´ para salir: Digite ´s´ para seguir");
            sc.nextLine();
            opcion = sc.nextLine();
            if (opcion.equals("s")){ //Si el usuario seleciona (s) 
                //conntinuara en el bucle
                bandera = true;
            }else {
             if (opcion.equals("n")){ //Si el usuario seleciona (n)
                 //Se saldra del bucle
                 bandera = false;
             }   
                
            }
     //Impresion en pantalla del mensaje final
      System.out.printf("Reporte Gastos padre de Familia\n\n"
              + "Reporte\n\nNombre del Padre de Familia: %s\nSueldo "
              + "Mensual: %d\nNumero de Hijos: %d\n\nReporte de "
              + "Gastos\nPersona     \tPasaje       \tBar      \tSalidas"
              + "\n%s\nFin Reporte\n",nombre,sueldo,n, mensajef); 

    }

   
    }
    
}
