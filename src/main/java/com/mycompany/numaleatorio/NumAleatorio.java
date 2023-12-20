/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numaleatorio;

/**
 *
 * @author Luis_Martinez
 */
public class NumAleatorio {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            System.out.print(numero);

            // Verificar si el número es par o impar
            if (esPar(numero)) {
                System.out.println(" - Par");
            } else {
                System.out.println(" - Impar");
            }
        }
    }

    // Método para verificar si un número es par
    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

