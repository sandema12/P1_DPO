package Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import LearningPath.Actividad;
import LearningPath.LearningPath;
import Usuario.Usuario;
import Consola.ConsolaAutenticacion;

public class CentralPersistencia {

	private LearningPath learning_path;
	private ConsolaAutenticacion usuarios_consola;
	
	public CentralPersistencia (LearningPath lng_pth, ConsolaAutenticacion us) {
		learning_path = lng_pth;
		usuarios_consola = us;
	}
	
	public void cargarLearningPaths() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(new File(("./data/actividades.dat"))));
		ArrayList<Actividad> actividades = (ArrayList<Actividad>)ois.readObject();
		learning_path.setActividades(actividades);
	}
	
	public void persistirLearningPaths() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("./data/actividades.dat")));
		oos.writeObject(learning_path.getActividades());
		oos.close();
	}
	
	public void cargarUsuarios() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(new File(("./data/usuarios.dat"))));
		ArrayList<Usuario> usuarios = (ArrayList<Usuario>)ois.readObject();
		usuarios_consola.setUsuarios(usuarios);
	}
	
	public void persistirUsuarios() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("./data/usuarios.dat")));
		oos.writeObject(usuarios_consola.getUsuarios());
		oos.close();
	}

}
