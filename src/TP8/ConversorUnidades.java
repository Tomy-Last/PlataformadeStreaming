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
public class ConversorUnidades {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de medida:");
        System.out.println("1. Longitud");
        System.out.println("2. Peso");
        System.out.println("3. Volumen");
        int tipoMedida = scanner.nextInt();
        
        if (tipoMedida == 1) {
            System.out.println("Seleccione la unidad de origen:");
            System.out.println("1. Metros");
            System.out.println("2. Kilómetros");
            double valor;
            System.out.print("Ingrese el valor a convertir: ");
            valor = scanner.nextDouble();
            System.out.print("Seleccione la unidad de destino (1 para Metros, 2 para Kilómetros): ");
            int unidadDestino = scanner.nextInt();
            
            if (unidadDestino == 1) {
                System.out.printf("Valor convertido: %.2f Metros%n", valor);
            } else if (unidadDestino == 2) {
                System.out.printf("Valor convertido: %.2f Kilómetros%n", valor / 1000);
            } else {
                System.out.println("Unidad no válida.");
            }
        } else if (tipoMedida == 2) {
            System.out.println("Seleccione la unidad de origen:");
            System.out.println("1. Kilogramos");
            System.out.println("2. Gramos");
            double valor;
            System.out.print("Ingrese el valor a convertir: ");
            valor = scanner.nextDouble();
            System.out.print("Seleccione la unidad de destino (1 para Kilogramos, 2 para Gramos): ");
            int unidadDestino = scanner.nextInt();
            
            if (unidadDestino == 1) {
                System.out.printf("Valor convertido: %.2f Kilogramos%n", valor);
            } else if (unidadDestino == 2) {
                System.out.printf("Valor convertido: %.2f Gramos%n", valor * 1000);
            } else {
                System.out.println("Unidad no válida.");
            }
        } else if (tipoMedida == 3) {
            System.out.println("Seleccione la unidad de origen:");
            System.out.println("1. Litros");
            System.out.println("2. Mililitros");
            double valor;
            System.out.print("Ingrese el valor a convertir: ");
            valor = scanner.nextDouble();
            System.out.print("Seleccione la unidad de destino (1 para Litros, 2 para Mililitros): ");
            int unidadDestino = scanner.nextInt();
            
            if (unidadDestino == 1) {
                System.out.printf("Valor convertido: %.2f Litros%n", valor);
            } else if (unidadDestino == 2) {
                System.out.printf("Valor convertido: %.2f Mililitros%n", valor * 1000);
            } else {
                System.out.println("Unidad no válida.");
            }
        } else {
            System.out.println("Tipo de medida no válido.");
        }
        
        scanner.close();
    }
}    

