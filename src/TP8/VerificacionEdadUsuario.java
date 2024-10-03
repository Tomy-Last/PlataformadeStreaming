/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author ASUS
 */

import java.util.Calendar;
import java.util.Scanner;

public class VerificacionEdadUsuario {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su fecha de nacimiento (formato: YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        
        // Separar la fecha de nacimiento
        String[] partes = fechaNacimiento.split("-");
        int anioNacimiento = Integer.parseInt(partes[0]);
        int mesNacimiento = Integer.parseInt(partes[1]);
        int diaNacimiento = Integer.parseInt(partes[2]);
        
        // Obtener la fecha actual
        Calendar calendario = Calendar.getInstance();
        int anioActual = calendario.get(Calendar.YEAR);
        int mesActual = calendario.get(Calendar.MONTH) + 1; // Los meses comienzan en 0
        int diaActual = calendario.get(Calendar.DAY_OF_MONTH);
        
        // Calcular la edad
        int edad = anioActual - anioNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        // Verificar si la edad es menor de 13 años
        if (edad < 13) {
            System.out.println("La edad del usuario es menor a la permitida.");
            System.out.println("Redirigiendo a paginas adecuadas para menores de 13 años...");
            // Aqui puedes agregar enlaces a las paginas
            System.out.println("Página recomendada: www.juegospara niños.com");
        } else {
            System.out.println("Acceso permitido. Bienvenido a la red social.");
        }

        scanner.close();
    }
}
