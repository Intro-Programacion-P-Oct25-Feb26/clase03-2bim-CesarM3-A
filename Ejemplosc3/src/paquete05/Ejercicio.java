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

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese los nombres de los encargados de "
                    + "cada estación:");
            System.out.printf("Nombre del encargado de %s: ",
                     nombresEstaciones[i]);
            nombresEncargados[i] = entrada.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese la producción mensual de cada "
                    + "estación (en dólares):");
            System.out.printf("Producción mensual de %s:\n",
                     nombresEstaciones[i]);
            for (int j = 0; j < 12; j++) {
                System.out.printf("Mes %d: ", j + 1);
                produccionMensual[i][j] = entrada.nextInt();
            }
            entrada.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                produccionTotal[i]
                        = produccionTotal[i] + produccionMensual[i][j];
            }
        }

        for (int i = 1; i < 5; i++) {
            if (produccionTotal[i] > produccionTotal[estacionProductiva]) {
                estacionProductiva = i;
            }
        }

        System.out.println("\nAnálisis de Producción\n");
        System.out.println("Estación\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nombre Estación: %s - Total Producción: $ %d\n",
                     nombresEstaciones[i],
                     produccionTotal[i]);
        }

        System.out.printf("\nEstación más productiva: %s\nEncargado de la "
                + "estación: %s\n",
                 nombresEstaciones[estacionProductiva],
                 nombresEncargados[estacionProductiva]);

    }
}
