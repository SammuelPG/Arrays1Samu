/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays1;

import utilidades.Numeros;

/**
 *
 * @author dam
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Parking parking2= new Parking(5);
       parking2.Inicializar();
        int opcion;
        menu();
        opcion=Numeros.pedirNumeroentre2limites("Opcion", 1, 4);
        while (opcion!=4){
            switch (opcion){
                case 1:
                    System.out.println(parking2.EntradaVehiculo());
                    break;
                case 2:
                   System.out.println(parking2.salidaVehiculo());
                    break;
                case 3:
                    parking2.verEstado();
                    break;
            }
         menu();
         opcion=Numeros.pedirNumeroentre2limites("Opcion", 1, 4);
        }
    }
    private static void menu(){
        System.out.println("1. nuevo vehiculo");
        System.out.println("2. salida vehiculo");
        System.out.println("3. Estado");
        System.out.println("4. Salir");
        System.out.println("");
    }
    
}
