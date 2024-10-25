package LearningPath;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import Usuario.Estudiante;

public class Actividad {
   
	private String titulo;
    private String descripcion;
    private String objetivo;
    private String dificultad;
    private int duracionMinutos;
    private boolean obligatoria;
    private LocalDate fechaLimite;
    private String resultado;


    public Actividad(String titulo, String descripcion, String objetivo, String dificultad,  boolean obligatoria, int duracionMinutos, LocalDate fechaLimite) {
        this.titulo = titulo;
    	this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.dificultad = dificultad;
        this.duracionMinutos = duracionMinutos;
        this.obligatoria = obligatoria;
        this.fechaLimite = fechaLimite;
        
    }



	public void completarActividad(Estudiante estudiante) {
        System.out.println("El estudiante " + estudiante.getNombre() + " ha completado la actividad: " + descripcion);
        this.resultado = "Completada";
    }

    public boolean verificarPrerequisitos(Estudiante estudiante) {
        System.out.println("Verificando requisitos previos para la actividad: " + descripcion);

        return true; 
    }

    public LocalDate calcularFechaLimite() {
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

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
