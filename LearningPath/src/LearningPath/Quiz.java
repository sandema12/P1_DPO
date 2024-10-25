package LearningPath;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Usuario.Estudiante;

public class Quiz extends Actividad {

    private List<Pregunta> preguntas;
    private double notaMinima;


    public Quiz(String descripcion, String objetivo, int dificultad, int duracionMinutos, boolean obligatoria, 
                double notaMinima, LocalDate fechaLimite) {
        super(descripcion, objetivo, dificultad, obligatoria, duracionMinutos, fechaLimite);
        this.preguntas = new ArrayList<>();
        this.notaMinima = notaMinima;
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
        System.out.println("Pregunta agregada: " + pregunta.getEnunciado());
    }

    public void calificarQuiz(Estudiante estudiante, List<String> respuestas) {
        double puntajeObtenido = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta pregunta = preguntas.get(i);
            if (pregunta.verificarRespuesta(respuestas.get(i))) {
                puntajeObtenido += pregunta.getPuntaje();
            }
        }

        if (puntajeObtenido >= notaMinima) {
            System.out.println("El estudiante " + estudiante.getNombre() + " aprobó el quiz con una nota de: " + puntajeObtenido);
            completarActividad(estudiante);
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() + " no aprobó el quiz. Nota obtenida: " + puntajeObtenido);
        }
    }


    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }
}
