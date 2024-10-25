package LearningPath;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Usuario.Estudiante;

public class Examen extends Actividad {
    // Atributos
    private List<Pregunta> preguntas;
    private String estado; // Puede ser "Pendiente", "Entregado", "Calificado"

    // Constructor
    public Examen(String descripcion, String objetivo, int dificultad, int duracionMinutos, boolean obligatoria, LocalDate fechaLimite) {
        super(descripcion, objetivo, dificultad, obligatoria, duracionMinutos, fechaLimite);
        this.preguntas = new ArrayList<>();
        this.estado = "Pendiente";
    }


    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
        System.out.println("Pregunta agregada al examen: " + pregunta.getEnunciado());
    }

    public void entregarExamen(Estudiante estudiante, List<String> respuestas) {
        if (estado.equals("Pendiente")) {
            estado = "Entregado";
            System.out.println("El estudiante " + estudiante.getNombre() + " ha entregado el examen: " + getDescripcion());
            calificarExamen(estudiante, respuestas);
        } else {
            System.out.println("El examen ya ha sido entregado.");
        }
    }

    public void calificarExamen(Estudiante estudiante, List<String> respuestas) {
        double puntajeObtenido = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta pregunta = preguntas.get(i);
            if (pregunta.verificarRespuesta(respuestas.get(i))) {
                puntajeObtenido += pregunta.getPuntaje();
            }
        }
        estado = "Calificado";
        setResultado("Nota obtenida: " + puntajeObtenido);
        System.out.println("El examen del estudiante " + estudiante.getNombre() + " ha sido calificado con: " + puntajeObtenido);
    }


    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
