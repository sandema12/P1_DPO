package Consola;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import LearningPath.LearningPath;
import Usuario.Profesor;


public class ConsolaProfesor {
	

    private Scanner entrada;
    
    public ConsolaProfesor() {
        
        entrada = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
		
        int opcion;
        
        do {
        
            System.out.println("1. Crear Learning Path");
            System.out.println("2. Editar Learning Path");
            System.out.println("3. Calificar actividad");
            System.out.println("4. Dejar reseña");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            
            switch (opcion) {
            
            //Crear learningpath
            case 1:
            	System.out.print("Nombre del Learning Path: ");
                String titulo = entrada.nextLine();
                
                System.out.print("Descripción: ");
                String descripcion = entrada.nextLine();
                
                System.out.print("Objetivos: ");
                String objetivos = entrada.nextLine();
                
                System.out.print("Dificultad: ");
                String dificultad = entrada.nextLine();
                
                System.out.print("Duración total en minutos: ");
                int duracionMinutos = Integer.parseInt(entrada.nextLine());
            	
                Profesor.crearLearningPath(titulo, descripcion, objetivos, dificultad, duracionMinutos);
                break;
                
                
                
                
            //Editar learningpath
            case 2:
            	
            	System.out.println("Ingrese el nombre del Learning Path a modificar");
            	String nombre = entrada.nextLine();
            	List<LearningPath> lp_Lista = Profesor.getLearningPathsCreados();
            	LearningPath lp = Profesor.getLearningPath(lp_Lista, nombre);
            	
            	System.out.println("Detalles actuales del Learning Path:");
        	    System.out.println("Título: " + lp.getTitulo());
        	    System.out.println("Descripción: " + lp.getDescripcion());
        	    System.out.println("Dificultad: " + lp.getDificultad());
        	    System.out.println("Duración total en minutos: " + lp.getDuracionTotalMinutos());
        	    System.out.println("Rating: " + lp.getRating());
        	    System.out.println("Versión: " + lp.getVersion());

        	    System.out.print("Nuevo título (dejar en blanco para no cambiar): ");
        	    String nuevoTitulo = entrada.nextLine();
        	    if (!nuevoTitulo.isEmpty()) {
        	        lp.setTitulo(nuevoTitulo);
        	    }

        	    System.out.print("Nueva descripción (dejar en blanco para no cambiar): ");
        	    String nuevaDescripcion = entrada.nextLine();
        	    if (!nuevaDescripcion.isEmpty()) {
        	        lp.setDescripcion(nuevaDescripcion);
        	    }

        	    System.out.print("Nueva dificultad (dejar en blanco para no cambiar): ");
        	    String dificultadInput = entrada.nextLine();
        	    if (!dificultadInput.isEmpty()) {
        	        String nuevaDificultad = dificultadInput;
        	        lp.setDificultad(nuevaDificultad);
        	    }

        	    System.out.print("Nueva duración total en minutos (dejar en blanco para no cambiar): ");
        	    String duracionInput = entrada.nextLine();
        	    if (!duracionInput.isEmpty()) {
        	        int nuevaDuracion = Integer.parseInt(duracionInput);
        	        lp.setDuracionTotalMinutos(nuevaDuracion);
        	    }

        	    lp.setFechaModificacion(LocalDateTime.now());

        	    System.out.println("Learning Path editado exitosamente.");
            	
                Profesor.editarLearningPath();
                break;
                
                
                
                
                
            case 3:
                Profesor.calificarActividad();
                break;
            case 4:
                Profesor.dejarReseña();
                break;
            case 5:
                System.out.println("Fin.");
                break;
            default:
                System.out.println("La opción no es válida");

            }
            
        }while (opcion != 5);
	}
}
    
    
	