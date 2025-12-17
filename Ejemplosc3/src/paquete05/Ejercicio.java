/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
// Declaración de variables
        String[] nombresEstaciones = new String[5];
        String[] nombresEncargados = new String[5];
        int[][] produccionMensual = new int[5][12];
        int[] produccionTotal = new int[5];
        int estacionProductiva = 0;

        
        System.out.println("Ingrese los nombres de las 5 estaciones:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nombre de la estación %d: ", i + 1);
            nombresEstaciones[i] = entrada.nextLine();
        }

        
    }
}
