package LearningPath;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Usuario.Estudiante;

public class Encuesta extends Actividad {

    private List<PreguntaAbierta> preguntas;

    public Encuesta(String descripcion, String objetivo, int dificultad, int duracionMinutos, boolean obligatoria, LocalDate fechaLimite) {
        super(descripcion, objetivo, dificultad, obligatoria, duracionMinutos, fechaLimite);
        this.preguntas = new ArrayList<>();
    }


    public void agregarPregunta(PreguntaAbierta pregunta) {
        preguntas.add(pregunta);
        System.out.println("Pregunta abierta agregada: " + pregunta.getEnunciado());
    }

    public void completarEncuesta(Estudiante estudiante, List<String> respuestas) {
        System.out.println("El estudiante " + estudiante.getNombre() + " ha completado la encuesta: " + getDescripcion());
        for (int i = 0; i < preguntas.size(); i++) {
            PreguntaAbierta pregunta = preguntas.get(i);
            System.out.println("Respuesta a la pregunta \"" + pregunta.getEnunciado() + "\": " + respuestas.get(i));
        }
        completarActividad(estudiante);  
    }


    public List<PreguntaAbierta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PreguntaAbierta> preguntas) {
        this.preguntas = preguntas;
    }
}
