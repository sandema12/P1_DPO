package LearningPath;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LearningPath {
    
    private String titulo;
    private String descripcion;
    private int dificultad; 
    private int duracionTotalMinutos;
    private double rating;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String version;
    private List<Actividad> actividades;

   
    public LearningPath(String titulo, String descripcion, int dificultad, String version) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.fechaCreacion = new Date();
        this.fechaModificacion = new Date();
        this.version = version;
        this.actividades = new ArrayList<>();
        this.duracionTotalMinutos = 0;
        this.rating = 0.0;
    }

   
    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
        calcularDuracionTotal();
        System.out.println("Actividad agregada: " + actividad.getDescripcion());
    }

    public void eliminarActividad(Actividad actividad) {
        if (actividades.remove(actividad)) {
            calcularDuracionTotal();
            System.out.println("Actividad eliminada: " + actividad.getDescripcion());
        } else {
            System.out.println("La actividad no existe en el Learning Path.");
        }
    }

    public void calcularDuracionTotal() {
        duracionTotalMinutos = actividades.stream().mapToInt(Actividad::getDuracionMinutos).sum();
        System.out.println("Duración total del Learning Path: " + duracionTotalMinutos + " minutos.");
    }

    public void calcularRating() {
        System.out.println("El rating actual del Learning Path es: " + rating);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getDuracionTotalMinutos() {
        return duracionTotalMinutos;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
}
