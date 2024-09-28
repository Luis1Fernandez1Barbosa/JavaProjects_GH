package aragon.unam.mx.repositorio.intf;
import java.util.List; 
import aragon.unam.mx.modelo.Estudiante;

public interface BaseDeDatosDAO {
	public List<Estudiante> getEstudiantes(String carrera); 
	
	public Estudiante getEstudiante(String carrera,String matricula);
}