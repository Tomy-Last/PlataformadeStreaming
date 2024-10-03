/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;
        
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class PlaylistGestion {

public class GestorPlaylists {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> playlist = new ArrayList<>();
            
            while (true) {
                System.out.print("Ingrese el nombre de la canción a añadir (o 'salir' para terminar): ");
                String cancion = scanner.nextLine();
                
                if (cancion.equalsIgnoreCase("salir")) {
                    break;
                }
                
                if (playlist.contains(cancion)) {
                    System.out.println("La canción ya existe en la playlist.");
                    System.out.print("¿Desea mover la canción existente al final de la lista? (Si/No): ");
                    String respuesta = scanner.nextLine();
                    
                    if (respuesta.equalsIgnoreCase("Si")) {
                        playlist.remove(cancion); // Eliminar la canción existente
                        playlist.add(cancion); // Añadir la canción al final
                        System.out.println("La canción ha sido movida al final de la playlist.");
                    } else {
                        System.out.println("La canción no se ha movido.");
                    }
                } else {
                    playlist.add(cancion);
                    System.out.println("Canción añadida a la playlist.");
                }
                
                System.out.println("Playlist actual: " + playlist);
            }
        }
        System.out.println("Gestor de playlists cerrado.");
    }
}    
}
