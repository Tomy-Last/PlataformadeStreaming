/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class TipsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();
        
        System.out.print("Ingrese la propina que desea dejar: ");
        double propina = scanner.nextDouble();
        
        double propinaMinima = totalCuenta * 0.10; // 10% de la cuenta
        
        if (propina < propinaMinima) {
            System.out.println("Error: La propina debe ser al menos el 10% de la cuenta.");
            System.out.printf("Propina minima recomendable: %.2f%n", propinaMinima);
        } else {
            System.out.println("Propina aceptada. Muchas gracias!");
        }
        
        scanner.close();
    }
}    
