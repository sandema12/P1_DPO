package Usuario;

import java.util.ArrayList;
import java.util.List;

import LearningPath.Actividad;
import LearningPath.LearningPath;

public class Profesor extends Usuario {

    private List<LearningPath> learningPathsCreados;


    public Profesor(String username, String password, String nombre) {
        super(username, password, nombre, "Profesor");
        this.learningPathsCreados = new ArrayList<>();
    }


    public void crearLearningPath(LearningPath learningPath) {
        learningPathsCreados.add(learningPath);
        System.out.println("Learning Path creado: " + learningPath.getTitulo());
    }

    public void editarLearningPath(LearningPath learningPath, String nuevoTitulo, String nuevaDescripcion, int nuevaDificultad) {
        if (learningPathsCreados.contains(learningPath)) {
            learningPath.setTitulo(nuevoTitulo);
            learningPath.setDescripcion(nuevaDescripcion);
            learningPath.setDificultad(nuevaDificultad);
            learningPath.setFechaModificacion(new java.util.Date());
            System.out.println("Learning Path editado: " + nuevoTitulo);
        } else {
            System.out.println("No tienes permiso para editar este Learning Path.");
        }
    }

    public void calificarActividad(Estudiante estudiante, Actividad actividad, String resultado) {
        actividad.setResultado(resultado);
        System.out.println("Actividad " + actividad.getDescripcion() + " calificada como: " + resultado + " para el estudiante " + estudiante.getNombre());
    }

    public void verProgresoEstudiantes() {
        System.out.println("Progreso de los estudiantes en tus Learning Paths:");
        for (LearningPath lp : learningPathsCreados) {
            System.out.println("Learning Path: " + lp.getTitulo());

        }
    }


    public List<LearningPath> getLearningPathsCreados() {
        return learningPathsCreados;
    }
}
