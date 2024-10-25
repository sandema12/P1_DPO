package LearningPath;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Usuario.Estudiante;

public class Actividad {
   
    private String descripcion;
    private String objetivo;
    private int dificultad;
    private int duracionMinutos;
    private boolean obligatoria;
    private List<Actividad> actividadesPreviasSugeridas;
    private List<Actividad> actividadesSeguimiento;
    private Date fechaLimite;
    private String resultado;


    public Actividad(String descripcion, String objetivo, int dificultad, int duracionMinutos, boolean obligatoria, Date fechaLimite) {
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.dificultad = dificultad;
        this.duracionMinutos = duracionMinutos;
        this.obligatoria = obligatoria;
        this.fechaLimite = fechaLimite;
        this.actividadesPreviasSugeridas = new ArrayList<>();
        this.actividadesSeguimiento = new ArrayList<>();
        this.resultado = "Pendiente";
    }


    public void completarActividad(Estudiante estudiante) {
        System.out.println("El estudiante " + estudiante.getNombre() + " ha completado la actividad: " + descripcion);
        this.resultado = "Completada";
    }

    public boolean verificarPrerequisitos(Estudiante estudiante) {
        System.out.println("Verificando requisitos previos para la actividad: " + descripcion);

        return true; 
    }

    public Date calcularFechaLimite() {
        return fechaLimite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

    public List<Actividad> getActividadesPreviasSugeridas() {
        return actividadesPreviasSugeridas;
    }

    public void setActividadesPreviasSugeridas(List<Actividad> actividadesPreviasSugeridas) {
        this.actividadesPreviasSugeridas = actividadesPreviasSugeridas;
    }

    public List<Actividad> getActividadesSeguimiento() {
        return actividadesSeguimiento;
    }

    public void setActividadesSeguimiento(List<Actividad> actividadesSeguimiento) {
        this.actividadesSeguimiento = actividadesSeguimiento;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
