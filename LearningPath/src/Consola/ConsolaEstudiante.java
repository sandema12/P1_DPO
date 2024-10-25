package Consola;

import java.util.Scanner;


public class ConsolaEstudiante {
    
    private Scanner entrada;
    

    public ConsolaEstudiante() {
        entrada = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("1. Ver Learning Paths");
            System.out.println("2. Iniciar Actividad");
            System.out.println("3. Ver Calificaciones");
            System.out.println("4. Dejar Reseña");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 
            
            switch (opcion) {
                case 1:
                    verLearningPaths();
                    break;
                case 2:
                    iniciarActividad();
                    break;
                case 3:
                    verCalificaciones();
                    break;
                case 4:
                    dejarReseña();
                    break;
                case 5:
                    System.out.println("Fin.");
                    break;
                default:
                    System.out.println("La opción no es válida.");
            }
        } while (opcion != 5);
    }
    
    private void verLearningPaths() {
        // Implementa la lógica para mostrar los Learning Paths disponibles
        System.out.println("Mostrando Learning Paths disponibles...");
        // Aquí deberías recuperar y mostrar los Learning Paths para el estudiante
    }

    private void iniciarActividad() {
        // Implementa la lógica para iniciar una actividad
        System.out.println("Iniciando actividad...");
        // Aquí deberías permitir que el estudiante seleccione una actividad para iniciar
    }

    private void verCalificaciones() {
        // Implementa la lógica para mostrar las calificaciones del estudiante
        System.out.println("Mostrando calificaciones...");
        // Aquí deberías recuperar y mostrar las calificaciones del estudiante
    }

    private void dejarReseña() {
        
        System.out.print("Ingrese su reseña: ");
        String reseña = entrada.nextLine();
        
        System.out.print("Ingrese su calificación (1-5): ");
        int rating = entrada.nextInt();
        entrada.nextLine(); 
        
        // Aquí deberías guardar la reseña y la calificación
        System.out.println("Reseña dejada exitosamente.");
    }
}
