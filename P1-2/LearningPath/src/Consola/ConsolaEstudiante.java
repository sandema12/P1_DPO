package Consola;

import java.util.List;
import java.util.Scanner;

import LearningPath.Actividad;
import LearningPath.LearningPath;
import Usuario.Profesor;
import Usuario.Estudiante;


public class ConsolaEstudiante {
    
    private Scanner entrada;
    

    public ConsolaEstudiante() {
        entrada = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("1. Ver Learning Paths");
            System.out.println("2. Inscribir Learning Path");
            System.out.println("3. Iniciar Actividad");
            System.out.println("4. Ver Calificaciones");
            System.out.println("6. Dejar Reseña");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 
            
            switch (opcion) {
                case 1:
                    verLearningPaths();
                    break;
                case 2:
                	inscribirLearningPath();
                    break;
                case 3:
                    iniciarActividad();
                    break;
                case 4:
                    verCalificaciones();
                    break;
                case 5:
                    dejarReseña();
                    break;
                case 6:
                    System.out.println("Fin.");
                    break;
                default:
                    System.out.println("La opción no es válida.");
            }
        } while (opcion != 5);
    }
    
    private void verLearningPaths() {
        // Muestra los Learning Paths disponibles al estudiante
    	
    	List<LearningPath> lp_creados = Profesor.getLearningPathsCreados();
    	for (LearningPath lp : lp_creados) {
    		System.out.println(lp.getTitulo());
    	}
    }
    
    private void inscribirLearningPath() {
        // El estudiante se inscribe a un Learning Path
    	System.out.print("Ingrese el nombre del Learning Path que desea inscribir: ");
    	String inscribir = entrada.nextLine(); 
    	List<LearningPath> lp_creados = Profesor.getLearningPathsCreados();
    	for (LearningPath lp : lp_creados) {
    		if (lp.getTitulo() == inscribir) {
    			Estudiante.inscribirseEnLearningPath(lp);
    			System.out.println("Se ha inscrito exitosamente el Learning Path: " + inscribir);
    		}
    	
    	}
    }

    private void iniciarActividad() {
        // Se realiza una actividad
    	System.out.print("Ingrese la actividad que desea realizar: ");
    	String actividad = entrada.nextLine(); 
    	Actividad actividadParaRealizar = null;
    	
    	List<Actividad> actividadesCreadas = LearningPath.getActividades();
    	for (Actividad act : actividadesCreadas) {
    		if (act.getTitulo() == actividad) {
    			actividadParaRealizar = act;
    		}
    	}
    	
    	Actividad.completarActividad(actividadParaRealizar);
    	
    	
 
    }

    private void verCalificaciones() {
        // Implementa la lógica para mostrar las calificaciones del estudiante
        System.out.println("Mostrando calificaciones...");
        // Aquí deberías recuperar y mostrar las calificaciones del estudiante
    }

    private void dejarReseña() {
        
        System.out.print("Ingrese su reseña: ");
        String reseña = entrada.nextLine();
        
        System.out.print("Ingrese su rating (1-5): ");
        int rating = entrada.nextInt();
        entrada.nextLine(); 
        
        // Aquí deberías guardar la reseña y la calificación
        System.out.println("Reseña dejada exitosamente.");
    }
}
