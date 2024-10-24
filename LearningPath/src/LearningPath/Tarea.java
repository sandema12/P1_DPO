package LearningPath;

import java.time.LocalDate;

public class Tarea extends Actividad {

    private String estado; 


    public Tarea(String descripcion, String objetivo, int dificultad, int duracionMinutos, boolean obligatoria, LocalDate fechaLimite) {
        super(descripcion, objetivo, dificultad, obligatoria, duracionMinutos, fechaLimite);
        this.estado = "Pendiente";
    }

    public void entregarTarea() {
        if (estado.equals("Pendiente")) {
            estado = "Entregada";
            System.out.println("La tarea ha sido entregada.");
        } else {
            System.out.println("La tarea ya ha sido entregada.");
        }
    }

    public void calificarTarea(String resultado) {
        if (estado.equals("Entregada")) {
            estado = "Calificada";
            setResultado(resultado);
            System.out.println("La tarea ha sido calificada con: " + resultado);
        } else {
            System.out.println("No se puede calificar una tarea que no ha sido entregada.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
