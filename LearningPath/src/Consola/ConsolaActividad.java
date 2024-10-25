package Consola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import LearningPath.Actividad;
import LearningPath.LearningPath; 

public class ConsolaActividad {
    private Scanner entrada;

    public ConsolaActividad() {
        entrada = new Scanner(System.in);
    }

    public List<Actividad> mostrarMenu() {
        List<Actividad> actividades = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Agregar Actividad");
            System.out.println("2. Ver Actividades");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                	
                	System.out.print("Ingrese el titulo de la actividad: ");
                    String titulo = entrada.nextLine();
                	
                    System.out.print("Descripción de la actividad: ");
                    String descripcion = entrada.nextLine();

                    System.out.print("Objetivo de la actividad: ");
                    String objetivo = entrada.nextLine();

                    System.out.print("Dificultad de la actividad (1-5): ");
                    String dificultad = entrada.nextLine();

                    System.out.print("Duración de la actividad en minutos: ");
                    int duracionMinutos = Integer.parseInt(entrada.nextLine());

                    System.out.print("¿Es esta actividad obligatoria? (sí/no): ");
                    boolean obligatoria = entrada.nextLine().equalsIgnoreCase("sí");
                    
                    System.out.print("Ingrese la fecha límite (YYYY-MM-DD): ");
                    String fechaLimiteStr = entrada.nextLine();
                    LocalDate fechaLimite = LocalDate.parse(fechaLimiteStr, DateTimeFormatter.ISO_LOCAL_DATE);

                	
                	
                    LearningPath.agregarActividad(titulo, descripcion, objetivo, dificultad, obligatoria, duracionMinutos, fechaLimite);
                    
                    break;
                case 2:
                    verActividades(actividades);
                    break;
                case 3:
                    System.out.println("Fin.");
                    break;
                default:
                    System.out.println("La opción no es válida");
            }
        } while (opcion != 3);

        return actividades; 
    }



    private void verActividades(List<Actividad> actividades) {
        if (actividades.isEmpty()) {
            System.out.println("No hay actividades agregadas.");
            return;
        }

        System.out.println("Actividades:");
        for (Actividad actividad : actividades) {
            System.out.println("- " + actividad.getDescripcion()); 
        }
    }
}
