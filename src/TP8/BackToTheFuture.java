/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP8;

/**
 *
 * @author ASUS
 */
public class BackToTheFuture {

public class ViajeEnElTiempo {
    private int anio;

    public ViajeEnElTiempo(int año) throws Exception {
        if (año < 1900 || año > 2100) {
            throw new Exception("¡Cuidado! Viajar a " + anio + " puede ser peligroso. Podrias alterar el curso de la historia o encontrar dinosaurios.");
        }
        this.anio = anio;
    }

    public void realizarViaje() {
        System.out.println("¡Has viajado al año " + anio + "!");
    }

    public void main(String[] args) {
        try {
            ViajeEnElTiempo viaje = new ViajeEnElTiempo(2025);
            viaje.realizarViaje();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Intentar un año peligroso
        try {
            ViajeEnElTiempo viajePeligroso = new ViajeEnElTiempo(1800);
            viajePeligroso.realizarViaje();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
}
