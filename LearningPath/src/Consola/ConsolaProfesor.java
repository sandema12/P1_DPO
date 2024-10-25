package Consola;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import LearningPath.LearningPath;
import LearningPath.Actividad;

public class ConsolaProfesor {
	
	//private GestorPersistencia gestorPersistencia;
    private Scanner entrada;
    
    public ConsolaProfesor() {
        //gestorPersistencia = new GestorPersistencia();
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
            case 1:
                crearLearningPath();
                break;
            case 2:
                editarLearningPath();
                break;
            case 3:
                calificarActividad();
                break;
            case 4:
                dejarReseña();
                break;
            case 5:
                System.out.println("Fin.");
                break;
            default:
                System.out.println("La opción no es válida");

            }
            
        }while (opcion != 5);
	}
    
    
	private void crearLearningPath() {
		
		System.out.print("Nombre del Learning Path: ");
        String titulo = entrada.nextLine();
        
        System.out.print("Descripción: ");
        String descripcion = entrada.nextLine();
        
        System.out.print("Dificultad: ");
        int dificultad = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Duración total en minutos: ");
        int duracionTotalMinutos = Integer.parseInt(entrada.nextLine());
        
        //Implementar calcular rating
        double rating = 0.0;
        
        LocalDateTime fechaCreacion = LocalDateTime.now();
        LocalDateTime fechaModificacion = LocalDateTime.now();

        System.out.print("Version: ");
        String version = entrada.nextLine();
        
       
        ConsolaActividad consolaActividad = new ConsolaActividad();
        List<Actividad> actividades = consolaActividad.mostrarMenu();
        
        LearningPath nuevoLearningPath = new LearningPath(titulo, descripcion, dificultad, duracionTotalMinutos, rating, fechaCreacion, fechaModificacion, version, actividades);
        //gestorPersistencia.guardarLearningPath(nuevoLearningPath);
	}
	
	private void editarLearningPath() {
	    System.out.print("Ingrese el título del Learning Path a editar: ");
	    String titulo = entrada.nextLine();

	    // Aquí deberías tener un método para buscar el LearningPath en el sistema.
	    // Supongamos que tienes un método que devuelve un LearningPath o null si no se encuentra.
	    LearningPath learningPath = buscarLearningPath(titulo);
	    
	    if (learningPath == null) {
	        System.out.println("Learning Path no encontrado.");
	        return;
	    }

	   
	    System.out.println("Detalles actuales del Learning Path:");
	    System.out.println("Título: " + learningPath.getTitulo());
	    System.out.println("Descripción: " + learningPath.getDescripcion());
	    System.out.println("Dificultad: " + learningPath.getDificultad());
	    System.out.println("Duración total en minutos: " + learningPath.getDuracionTotalMinutos());
	    System.out.println("Rating: " + learningPath.getRating());
	    System.out.println("Versión: " + learningPath.getVersion());

	    System.out.print("Nuevo título (dejar en blanco para no cambiar): ");
	    String nuevoTitulo = entrada.nextLine();
	    if (!nuevoTitulo.isEmpty()) {
	        learningPath.setTitulo(nuevoTitulo);
	    }

	    System.out.print("Nueva descripción (dejar en blanco para no cambiar): ");
	    String nuevaDescripcion = entrada.nextLine();
	    if (!nuevaDescripcion.isEmpty()) {
	        learningPath.setDescripcion(nuevaDescripcion);
	    }

	    System.out.print("Nueva dificultad (dejar en blanco para no cambiar): ");
	    String dificultadInput = entrada.nextLine();
	    if (!dificultadInput.isEmpty()) {
	        int nuevaDificultad = Integer.parseInt(dificultadInput);
	        learningPath.setDificultad(nuevaDificultad);
	    }

	    System.out.print("Nueva duración total en minutos (dejar en blanco para no cambiar): ");
	    String duracionInput = entrada.nextLine();
	    if (!duracionInput.isEmpty()) {
	        int nuevaDuracion = Integer.parseInt(duracionInput);
	        learningPath.setDuracionTotalMinutos(nuevaDuracion);
	    }

	    learningPath.setFechaModificacion(LocalDateTime.now());

	    System.out.println("Learning Path editado exitosamente.");
	    
	    // Aquí podrías guardar el LearningPath actualizado en la persistencia
	    // gestorPersistencia.guardarLearningPath(learningPath);
	}	
	
	private void calificarActividad() {
	    System.out.println("Seleccione el tipo de actividad a calificar:");
	    System.out.println("1. Quiz");
	    System.out.println("2. Examen");
	    System.out.println("3. Encuesta");
	    System.out.println("4. Tarea");
	    System.out.print("Elija una opción: ");
	    
	    int tipoActividad = entrada.nextInt();
	    entrada.nextLine();
	    
	    switch (tipoActividad) {
	        case 1: // Calificar Quiz
	            System.out.print("Ingrese el ID del Quiz: ");
	            String quizId = entrada.nextLine(); 
	            System.out.print("Ingrese la calificación (0-100): ");
	            double calificacionQuiz = entrada.nextDouble();
	            entrada.nextLine(); 
	            
	            // Busca el quiz por ID y califica
	            // Quiz quiz = buscarQuizPorId(quizId); // Implementa este método según tu lógica
	            // quiz.calificarQuiz(calificacionQuiz); // Asumiendo que calificarQuiz() acepta un double
	            System.out.println("Quiz calificado con éxito.");
	            break;

	        case 2: // Calificar Examen
	            System.out.print("Ingrese el ID del Examen: ");
	            String examenId = entrada.nextLine(); 
	            System.out.print("Ingrese la calificación (0-100): ");
	            double calificacionExamen = entrada.nextDouble();
	            entrada.nextLine(); 
	            
	            // Busca el examen por ID y califica
	            // Examen examen = buscarExamenPorId(examenId); // Implementa este método según tu lógica
	            // examen.calificarExamen(calificacionExamen); // Asumiendo que calificarExamen() acepta un double
	            System.out.println("Examen calificado con éxito.");
	            break;

	        case 3: // Calificar Encuesta
	            System.out.print("Ingrese el ID de la Encuesta: ");
	            String encuestaId = entrada.nextLine(); 
	            System.out.print("Calificación (exitosa/no exitosa): ");
	            String estadoEncuesta = entrada.nextLine();
	            
	            // Busca la encuesta por ID y califica
	            // Encuesta encuesta = buscarEncuestaPorId(encuestaId); // Implementa este método según tu lógica
	            // encuesta.completarEncuesta(estadoEncuesta.equalsIgnoreCase("exitosa")); // Modifica según tu implementación
	            System.out.println("Encuesta calificada con éxito.");
	            break;

	        case 4: // Calificar Tarea
	            System.out.print("Ingrese el ID de la Tarea: ");
	            String tareaId = entrada.nextLine(); 
	            System.out.print("Calificación (exitosa/no exitosa): ");
	            String estadoTarea = entrada.nextLine();
	            
	            // Busca la tarea por ID y califica
	            // Tarea tarea = buscarTareaPorId(tareaId); // Implementa este método según tu lógica
	            // tarea.entregarTarea(estadoTarea.equalsIgnoreCase("exitosa")); // Modifica según tu implementación
	            System.out.println("Tarea calificada con éxito.");
	            break;

	        default:
	            System.out.println("Opción no válida.");
	            break;
	    }
	}	
	
	private void dejarReseña() {
	    System.out.print("Ingrese el ID del Learning Path o Actividad para dejar una reseña: ");
	    String id = entrada.nextLine(); 
	    

	    System.out.print("Ingrese un rating (1-5): ");
	    int rating = entrada.nextInt();
	    entrada.nextLine(); 


	    if (rating < 1 || rating > 5) {
	        System.out.println("El rating debe estar entre 1 y 5.");
	        return;
	    }


	    System.out.print("Ingrese su feedback: ");
	    String feedback = entrada.nextLine();

	    // Aquí debes implementar la lógica para asociar la reseña con el Learning Path o Actividad
	    // Ejemplo:
	    // Reseña reseña = new Reseña(rating, feedback);
	    // buscarActividadPorId(id).agregarReseña(reseña); // Método ficticio, implementa según tu lógica
	    
	    System.out.println("Reseña dejada exitosamente.");
	}
	
	


	
	




	
	
}
