/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import utilidades.Numeros;

/**
 *
 * @author dam
 */
public class Parking {

    String[] plazas;

    public Parking() {
        plazas = new String[100];
    }

    public Parking(int nplazas) {
        plazas = new String[nplazas];
    }

    public void Inicializar() {
        for (int nplazas = 0; nplazas < plazas.length; nplazas++) {
            plazas[nplazas] = "libre";
        }
    }

    public void verEstado() {
        System.out.println("Nplaza\t estado");
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            System.out.println(nplaza + "\t" + plazas[nplaza]);
        }
    }

    /**
     * Metodo que busca la primera plaza libre
     *
     * @return posicion de la primera plaza libre o -1 en el caso de que el
     * parking se encuentre completo
     */
    public int BuscarPlazaLibre() {
        int nplaza = 0;
        boolean encontrado = false;
        while (!encontrado && nplaza < plazas.length) {
            if (plazas[nplaza].equalsIgnoreCase("Libre")) {
                encontrado = true;
            } else {
                nplaza++;
            }
        }
        if (!encontrado) {
            nplaza = -1;
        }
        return nplaza;
    }

    public String EntradaVehiculo() {
        String salida;
        int nplaza = BuscarPlazaLibre();
        if (nplaza != -1) {
            plazas[nplaza] = "Ocupada";
            salida = "Plaza Asignada " + nplaza;
        } else {
            salida = "Parking completo";
        }
        return salida;
    }

    public String salidaVehiculo() {
        int nplaza;
        String salida;
        nplaza = Numeros.pedirNumeroentre2limites("introduce el numero plaza a liberar", 0, plazas.length - 1);
        if (plazas[nplaza].equalsIgnoreCase("Libre")) {
            salida = "la plaza " + nplaza + " ya estaba libre";
        } else {
            plazas[nplaza] = "libre";
            salida = "la plaza " + nplaza + " ya se ha dejado libre";
        }
        return salida;
    }
}
